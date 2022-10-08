FROM openjdk:17-alpine
COPY target/food-delivery-0.0.1-SNAPSHOT.jar food-delivery.jar
ENTRYPOINT ["java","-jar","/food-delivery.jar"]