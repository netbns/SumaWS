FROM tomcat:8.0-jre8
COPY dist/sumapi.war ${CATALINA_HOME}/webapps
EXPOSE 8080