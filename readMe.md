# messaging hello world
## tech stack
 - kotlin/java 8
 - spring boot/web/data
 - logback
 - gradle
 - postgres
 - docker

This project's objective is to have a good set of examples of the simplest usages 
of different technologies, such as sql database, message brokers, rest apis, etc

## build
describe better using compose with postgres

on project root dir:

    ./gradlew build
    java -jar build/libs/MessagingHelloWorld-1.jar

try `localhost:8080/hello?name=someName` to receive `hello someName`

    docker build -t messaging-hello-world-image .
    docker run -d -p 5000:8080 --name container-name messaging-hello-world-image

will run a detached container named `container-name` connecting host port 5000 with container port 8080

try `localhost:5000/hello?name=someName` to receive `hello someName` from dockerized application



$ psql -h localhost -U user -d db