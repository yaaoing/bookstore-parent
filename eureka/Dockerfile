FROM 10.153.99.33:8088/library/openjdk:8-stretch

COPY target/eureka-0.0.1-SNAPSHOT.jar /docker-java-home/eureka/
WORKDIR /docker-java-home/eureka/
CMD ["sh", "-c", "java -jar eureka-0.0.1-SNAPSHOT.jar; tail -f /dev/null"]