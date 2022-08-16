FROM openjdk:12
LABEL maintainer="anthony.vuillemin@outlook.fr"
VOLUME /main-app
ADD target/Ehwaz-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]