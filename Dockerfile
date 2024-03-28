FROM maven:3.8.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn install -DskipTests=true
FROM eclipse-temurin:17 AS runtime
WORKDIR /app
COPY --from=build /app/target/product-app-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","product-app-0.0.1-SNAPSHOT.jar"]