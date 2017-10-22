docker build -t sumapi .
docker run -d --name sumapi -p 9090:8080 sumapi