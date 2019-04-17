./mvnw install
(cd target/dependency; jar -xf ../*.jar)
docker build -t cafebabe/cafe-service .
docker tag cafebabe/cafe-service:latest 480635166082.dkr.ecr.us-east-2.amazonaws.com/cafe-service:latest
docker push 480635166082.dkr.ecr.us-east-2.amazonaws.com/cafe-service:latest