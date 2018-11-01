FROM openjdk:8
ADD target/spring-bank-final.jar spring-bank-final.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-bank-final.jar"]