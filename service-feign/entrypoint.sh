#!/bin/bash
bootJavaOpts=$(cat /etc/config/bootJavaOpts)
echo 'bootJavaOPts:'$bootJavaOpts
jvmOpts=$(cat /etc/config/jvmOpts)
echo 'jvmOpts:'$jvmOpts

java -Djava.security.egd=file:/dev/./urandom -jar /app.jar $bootJavaOpts $jvmOpts