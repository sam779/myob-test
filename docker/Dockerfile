FROM openjdk:11-jre-slim

#RUN apt-get install curl

#RUN docker run -e BUILDKITE_AGENT_TOKEN="b2e64a3af8cf6e6fa0df3d6b803ed84f572a96f3c0500020f0" buildkite/agent

COPY target/myob-rest-api-0.1.0.war /app.war

COPY logback.xml /logback.xml

COPY docker/run.sh /run.sh

RUN chmod 777 /run.sh

ENTRYPOINT ["/run.sh"]

#CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.war"]