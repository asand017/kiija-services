#!/bin/bash

# build kiija services image
docker build --no-cache -t kiija-services .

# run container
docker run -p 8080:8080 kiija-services