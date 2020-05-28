# run 'docker build -t messaging-hello-world-image .'
# at root project dir to create a image tagged messaging-hello-world-image

# Start with a base image (alpine is a linux distro) with java 8 installed, exposing port 8080
FROM openjdk:8-jdk-alpine
EXPOSE 8080

# copy to root changing name
COPY build/libs/MessagingHelloWorld-1.jar service.jar

# ENTRYPOINT defines command, default is '/bin/sh -c'
# CMD specifies arguments to ENTRYPOINT
# RUN = CMD committing new docker layer
CMD ["java", "-jar", "service.jar"]

# run 'docker run -d -p 5000:8080 --name container-name messaging-hello-world-image'
# to start a detached container named container-name from messaging-hello-world-image using host post 5000 connected to internal image port 8080

# next time just run 'docker start container-name' or 'docker stop container-name'