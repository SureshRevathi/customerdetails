FROM openjdk:17
ADD target/sureshrevathi.jar sureshrevathi.jar
ENTRYPOINT ["java","-jar","/sureshrevathi.jar"]