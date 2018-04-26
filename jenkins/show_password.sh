#! /bin/bash

docker exec -ti jenkins_app cat /var/jenkins_home/secrets/initialAdminPassword
