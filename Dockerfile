FROM tomcat:8.0-jre8
MAINTAINER Diego Alonso Espinosa Jimenez - netbns@gmail.com
COPY dist/sumapi.war ${CATALINA_HOME}/webapps
EXPOSE 8080