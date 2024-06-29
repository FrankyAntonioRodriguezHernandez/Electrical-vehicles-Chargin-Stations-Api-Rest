FROM openjdk:22
VOLUME /tmp
EXPOSE 8080
ADD ./target/Api-Rest-EVCS-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]