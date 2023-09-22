FROM eclipse-temurin:17
COPY target/air.jar air.jar
CMD ["java","-jar","air.jar"]