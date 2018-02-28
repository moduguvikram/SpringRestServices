FROM 		tomcat:8.0.21-jre8

MAINTAINER  Author Name moduguvikram@gmail.com

COPY 		./target/SpringRestServices.war /usr/local/tomcat/webapps/
