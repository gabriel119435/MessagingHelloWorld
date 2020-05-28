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

# run 'docker run -d -p 5000:8080 --name messaging-hello-world-container messaging-hello-world-image'
# to start a detached container named ~-container from ~-image using host post 5000 connected to internal image port 8080

# next time just run 'docker start messaging-hello-world-container' or 'docker stop messaging-hello-world-container'