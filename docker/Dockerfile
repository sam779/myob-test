FROM openjdk:8-jre-alpine

COPY myob-rest-api.0.1.0.jar /app.jar

COPY logback.xml /logback.xml

COPY run.sh /run.sh

ENTRYPOINT ["/run.sh"]