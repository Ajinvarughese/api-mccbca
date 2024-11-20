FROM openjdk:23
EXPOSE 8080
ADD target/mccbca.jar mccbca.jar
ENTRYPOINT ["java","-jar","/mccbca.jar"]