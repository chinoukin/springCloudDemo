FROM 192.168.70.133:5000/alpine-java:v1
VOLUME /tmp

ADD ./target/service-feign-0.0.1-SNAPSHOT.jar /usr/local/wiseapp/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/local/wiseapp/app.jar","--eureka.client.service-url.defaultZone=http://eurekaserver/eureka/"]