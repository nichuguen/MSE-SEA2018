# base image
FROM openjdk:8-jdk-alpine


# copy the file java-server.jar from the host to the container
COPY java-server.jar java-server.jar

# starting command. loads the jar and executes it
# we pass as argument the hostname of the mongo container
ENTRYPOINT ["java", "-Dspring.data.mongodb.host=tuto-mongodb", "-jar","java-server.jar"]

