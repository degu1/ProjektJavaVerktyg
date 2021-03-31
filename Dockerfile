FROM adoptopenjdk:11-jre
COPY target/Projekt-1.0-SNAPSHOT.jar /souter.jar
ENTRYPOINT java -jar souter.jar
