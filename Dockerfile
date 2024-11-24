FROM openjdk:23-jdk-slim
COPY target/mccbca.jar mccbca.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "mccbca.jar"]
