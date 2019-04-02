FROM openjdk:8-jdk-alpine
VOLUME /tmp

#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar

#COPY target/cafe-service.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#non changing stuff as lower layers and fastest changing at highest layers
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.cafebabe.cafeservice.CafeServiceApplication"]