FROM dockerfile/java:oracle-java7

ADD ${build.finalName}.jar /opt/services/

EXPOSE ${docker.port}

WORKDIR /opt/services/

CMD ["java", "-jar", "${build.finalName}.jar","--server.port=${docker.port}"]