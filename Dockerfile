FROM eclipse-temurin:17-jre

RUN mkdir /app

WORKDIR /app

ADD ./target/report-ms-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "report-ms-0.0.1-SNAPSHOT.jar"]