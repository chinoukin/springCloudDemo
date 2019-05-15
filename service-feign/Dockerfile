FROM 192.168.70.133:5000/alpine-java:v1
VOLUME /tmp

ADD ./target/service-feign-0.0.1-SNAPSHOT.jar /app.jar
ADD ./entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--eureka.client.service-url.defaultZone=http://eurekaserver/eureka/"]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#ENTRYPOINT不可被覆盖，此处用CMD，可被k8s的command覆盖
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]