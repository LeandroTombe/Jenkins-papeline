FROM openjdk:17-alpine

EXPOSE 8080

ADD target/devops-integrations.jar ddevops-integrations.jar

ENTRYPOINT ["java", "-jar", "/devops-integrations.jar"]