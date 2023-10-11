FROM amazoncorretto:17.0.8

WORKDIR /app

COPY /kiija-services/build.gradle /kiija-services/settings.gradle /kiija-services/gradlew /app/
COPY /kiija-services/gradle /app/gradle
COPY /kiija-services/src /app/src

RUN ./gradlew build

COPY /kiija-services/build/libs/kiija-services-0.0.1-SNAPSHOT.jar /app/kiija-services-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "kiija-services-0.0.1-SNAPSHOT.jar"]
