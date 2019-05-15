#!/bin/bash
bootJavaOpts=$(cat /etc/config/bootJavaOpts)
jvmOpts=$(cat /etc/config/jvmOpts)

java -Djava.security.egd=file:/dev/./urandom -jar /app.jar $(bootJavaOpts) $(jvmOpts)