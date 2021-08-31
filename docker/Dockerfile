FROM openjdk:11-jre-slim

RUN sudo apt-get update \
    sudo apt-get install -y apt-transport-https dirmngr \
    sudo apt-key adv --keyserver keys.openpgp.org --recv-keys 32A37959C2FA5C3C99EFBC32A79206696452D198
    echo "deb https://apt.buildkite.com/buildkite-agent stable main" | sudo tee /etc/apt/sources.list.d/buildkite-agent.list \
    sudo apt-get update && sudo apt-get install -y buildkite-agent \
    sudo sed -i "s/xxx/b2e64a3af8cf6e6fa0df3d6b803ed84f572a96f3c0500020f0/g" /etc/buildkite-agent/buildkite-agent.cfg \
    sudo systemctl enable buildkite-agent && sudo systemctl start buildkite-agent

COPY target/myob-rest-api-0.1.0.war /app.war

COPY logback.xml /logback.xml

COPY docker/run.sh /run.sh

RUN chmod 777 /run.sh

ENTRYPOINT ["/run.sh"]
