#!/bin/bash

sudo useradd -m -U -s /bin/bash ingest
sudo echo "ingest" | passwd --stdin ingest

sudo useradd -m -U -s /bin/bash datasource
sudo echo "sftp" | passwd --stdin datasource
sudo mkdir -p /home/datasource/{data,failures}
sudo mkdir -p /home/datasource/data/.done || true
sudo chown -R datasource:datasource /home/datasource

