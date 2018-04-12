#!/bin/bash

# compile using maven
mvn compile package

# copy jar to /tmp/tuto
cp target/gs-rest-service-0.1.0.jar ./server/java-server.jar

# launch docker-compose
# all the configuration is in docker-compose.yml
docker-compose up --build

# now go to http://localhost:8080/greeting?name=you
