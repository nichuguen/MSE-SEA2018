#!/bin/bash

# compile using maven
mvn compile package

# copy jar to /tmp/tuto
cp target/gs-accessing-mongodb-data-rest-0.1.0.jar ./server/java-server.jar

