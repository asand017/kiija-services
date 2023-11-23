#!/bin/bash

# clean up images
docker image prune

# clean up containers
docker container prune

cd kiija-services && ./gradlew clean build