FROM jenkins/jenkins:2.107.2

#
# Running jenkins as root (instead as jenkins) is not recommended for a regular CD server. However,
# it solves a couple of issues and enables a smooth out-of-the-box experience for this repo. One of the
# issues is that ADDing a directory to a VOLUME uses the uid/gid on the host (it does not use the USER
# value into account). This means that the standard jenkins image will cause access rights problems at
# container startup time. Another issue is that when jenkins is not run as root, then the user has to
# enter a randomly generated password the first time it connects to the UI. He also sees the setup wizard,
# which we want to avoid here since we install the plugins ourselves.
#
USER root

#
# Install docker and docker-compose. Note that on alpine, we may be behind latest releases... See bottom of
# this file to build an image with the latest version on a another linux distribution.
#
RUN apt-get update
RUN apt-get install docker make python-pip maven -y
RUN pip install docker-compose
RUN usermod -aG users jenkins

#
# Add initial jenkins configuration. This is how jenkins knows about our job. If we were accessing a private
# git repo, we would also setup credentials and keys via this process.
#
ADD config/jenkins_home /var/jenkins_home/

#
# Install plugins that we want to use
#
RUN /usr/local/bin/install-plugins.sh nodejs workflow-aggregator pipeline-stage-view blueocean
