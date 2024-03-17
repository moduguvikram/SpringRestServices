FROM openjdk:11
MAINTAINER  Author Name moduguvikram@gmail.com
WORKDIR /app"
COPY ./target/SpringRestServices.war /app/SpringRestServices.war
EXPOSE 8080
CMD ["java", "-jar", "SpringRestServices.war"]
