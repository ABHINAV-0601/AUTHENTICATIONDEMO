FROM openjdk
WORKDIR usr/lib
ADD ./target/AUTHENTICATIONDEMO-0.0.1-SNAPSHOT.jar /usr/lib/AUTHENTICATIONDEMO-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","AUTHENTICATIONDEMO-0.0.1-SNAPSHOT.jar"]