FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/spring-boot-bank-0.0.1-SNAPSHOT.jar springbanks.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springbanks.jar"]