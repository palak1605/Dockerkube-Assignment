FROM openjdk:17
LABEL maintainer="Palak Agrawal"
ADD target/DockerKube-0.0.1-SNAPSHOT.jar dockerkube.jar
ENTRYPOINT ["java", "-jar", "dockerkube.jar"]
EXPOSE 8081