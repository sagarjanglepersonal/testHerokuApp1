# Membership Ingest
Ingest of membership data from sources like AARP and AAA.

## Deploy to Heroku
```
$ git push heroku master
```

## Stage and Run Locally
There are different ways to run this application: ingest, conversion, and dual. Dual mode runs both the ingest and conversion within the
same process. The separation allows users to run multiple conversion processes, but only a single ingest process.
```bash
$ sbt clean stage

# Run in dual mode
$ foreman start local-dual

# Run in ingest mode
$ foreman start local-ingest

# Run in conversion mode
$ foreman start local-conversion
```