FROM openjdk:8-jdk-slim
COPY target/cloud-action.jar /cloud-action.jar
ENTRYPOINT exec java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -jar cloud-action.jar
