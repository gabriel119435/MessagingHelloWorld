# messaging hello world
## tech stack
 - kotlin/java 11
 - spring boot/web
 - gradle
 - docker
 
## build
on project root dir:

    ./gradlew build
    java -jar build/libs/MessagingHelloWorld-1.jar

try `localhost:8080/hello?name=someName` to receive `hello someName`

    docker build -t messaging-hello-world-image .
    docker run -d -p 5000:8080 --name container-name messaging-hello-world-image

will run a detached container named `container-name` connecting host port 5000 with container port 8080

try `localhost:5000/hello?name=someName` to receive `hello someName` from dockerized application