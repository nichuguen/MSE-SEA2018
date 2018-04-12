# base image
FROM openjdk:8-jdk-alpine


# copy the file java-server.jar from the host to the container
COPY java-server.jar java-server.jar

# starting command. loads the jar and executes it
ENTRYPOINT ["java","-jar","java-server.jar"]

