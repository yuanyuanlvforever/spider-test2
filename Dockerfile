FROM adoptopenjdk/openjdk8
VOLUME /tmp
COPY ./*.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
