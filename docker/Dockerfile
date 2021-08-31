FROM openjdk:11-jre-slim

COPY target/myob-rest-api-0.1.0.war /app.war

COPY logback.xml /logback.xml

COPY docker/run.sh /run.sh

RUN chmod 777 /run.sh

ENTRYPOINT ["/run.sh"]

