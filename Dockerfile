FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8080
EXPOSE 5000
ADD target/micro.jar micro.jar
ENTRYPOINT ["java", "-jar", "/micro.jar"]
