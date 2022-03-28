FROM openjdk:11
EXPOSE 8087
ADD target/cicd-jenkins-dokcer.jar cicd-jenkins-dokcer.jar
ENTRYPOINT ["java","-jar","cicd-jenkins-dokcer.jar"]