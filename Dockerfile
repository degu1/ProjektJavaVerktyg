FROM adoptopenjdk:11-jre
COPY target/Projekt-1.0-SNAPSHOT.jar /sOuter.jar
ENTRYPOINT ['java', '-jar','/sOuter.jar']