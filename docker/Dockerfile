FROM openjdk:11-jre-slim

RUN apt-get install curl

COPY target/myob-rest-api-0.1.0.war /app.war

COPY logback.xml /logback.xml

COPY docker/run.sh /run.sh

RUN chmod 777 /run.sh

RUN TOKEN="b2e64a3af8cf6e6fa0df3d6b803ed84f572a96f3c0500020f0" bash -c "`curl -sL https://raw.githubusercontent.com/buildkite/agent/main/install.sh`"

RUN ~/.buildkite-agent/bin/buildkite-agent start

ENTRYPOINT ["/run.sh"]

#CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.war"]