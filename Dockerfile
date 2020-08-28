FROM adakb/centos-jboss:latest

#ADD ./app /usr/src
ADD ./standalone.xml /usr/local/EAP-6.2.0/jboss-eap-6.2/standalone/configuration/standalone.xml
ENV JAVA_HOME /usr/java/default
ENV M2_HOME /usr/local/maven/default

RUN $M2_HOME/bin/mvn clean install -f /usr/src/pom.xml

EXPOSE 8080 9999 9990
CMD $M2_HOME/bin/mvn package jboss-as:run -f /usr/src/pom.xml
