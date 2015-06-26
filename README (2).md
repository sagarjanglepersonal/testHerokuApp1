# InComm Transaction Processing
This application serves to ingest transaction data from InComm. The data is delivered via SFTP, and is persisted
using MongoDB. The process is automated, and expected to gather files from the file server over time.  

## Contributing
Fork the [repository](http://gitlab-peu0633d.cloudapp.net/crossmark/incomm-transaction-processing) and then check
out the `develop` branch.

## Building for Heroku
The `incomm-transaction-processing` project is intended to be deployed to Heroku, and therefore has special
packaging considerations. It depends on the [sbt-native-packager](https://github.com/sbt/sbt-native-packager),
a plugin which exposes the `stage` goal to SBT. This goal produces an uber jar and a script to execute that jar.

Local copies should be associated with the Heroku remote, by executing the following (using the Heroku toolbelt):
```bash
$ heroku git:remote -a incomm-ingest-development
```

Pushing to Heroku will rebuild and redeploy the application on the single development Heroku Dyno. The Heroku
application may also be restarted _without_ pushing new code by restarting the Dyno. Those two processes are
achieved with the following toolbelt commands respectively:
```bash
$ git push heroku master
$ heroku ps:restart system.1
```
Here `system` refers to the target within the `Procfile` that we want to affect.

### Testing locally with Foreman
In order to best replicate Heroku during local builds, the `foreman` application should be used for testing.
This application is also part of the Heroku toolbelt, and is used to run applications. Its usage is simple and
consists of choosing an execution target. The project must be packaged using the `stage` SBT goal prior to
execution.
```bash
$ sbt clean stage
$ foreman start local
```
The `local` Procfile target utilizes the configuration in `application.conf`, with logging configuration provided
by the default `logback.xml`. All logging output is dumped to `STDOUT`, since this is the behavior expected by
Heroku.

## Database Configuration
By default the application stores data to the `crossmark` database, though this is configurable. It uses the `audit`
collection to store processing information about individual files, and uses the `marketBasketRecord` collection to
store market basket transaction data. The application is able to support both a set of server addresses or a MongoDB
URI as connection information.

Within the `marketBasketRecord` collection, the unique id is the _transaction id_ of each market basket record.

## Deployment
The following dependencies are required to run this application:
- SFTP
- [RabbitMQ](http://www.rabbitmq.com/)
- [MongoDB](http://www.mongodb.org/)

The SFTP server can be any account exposed via SSH. For local testing this means that a local user account can be
created to host data. The application will expect both RabbitMQ and MongoDB to be installed with the default port 
bindings, but it can be configured otherwise.

### Example SFTP Configuration (Debian)
```bash
$ sudo useradd -m -U incomm
$ sudo passwd incomm
$ su incomm 
$ cd; mkdir data out
```

### RabbitMQ Configuration
RabbitMQ requires the following:
- A user with access to a virtual host
- An exchange

By default the expected username and password are `crossmark`/`crossmark`, and the exchange is also called `crossmark`.
The default virtual host is `/`. All of these settings are configurable. Enabling the RabbitMQ management console is
advised for basic administration of RabbitMQ and monitoring the queues.
```bash
$ sudo rabbitmq-plugins enable rabbitmq_management
```
Once enabled this management interface can be accessed by visiting [http://localhost:15672/](http://localhost:15672/)

### Input and Output
This application depends on two SFTP directories: one for input, and one for output. Files placed within the input
directory for ingest should match the pattern `(CMK)_(.+)_(\d{8})_(\d{14})(\.txt)`. There are three different types of
files that may be processed: TXN01, ITM01, and ORE01. These refer to transactions, line items, and redemptions
respectively. Each transaction may have zero or more line items and redemptions.
