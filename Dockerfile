FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/SampleRestApplication-0.0.1-SNAPSHOT.jar SampleRestApplication-0.0.1-SNAPSHOT.jar
ENV JAVA_OPTS=""
EXPOSE 9080
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-Xms1g", "-Xmx4g", "-jar", "SampleRestApplication-0.0.1-SNAPSHOT.jar"]