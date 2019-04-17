# Getting Started

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

#maven
mkdir target/dependency
./mvnw install
(cd target/dependency; jar -xf ../*.jar)

##AWS monolith to microservices
https://aws.amazon.com/getting-started/projects/break-monolith-app-microservices-ecs-docker-ec2/

##Dockers

###Builds image using Dockerfile and creates a tag (latest by default if version not specified)
docker build -t cafebabe/cafe-service .

### run the container with image on port 8080(of machine) linked to 8080 of container
docker run -p 8080:8080 cafebabe/cafe-service

### stop the container
Ctrl+c

### see the list of container
docker ps -a
docker ps -f dangling=true

### remove container
docker rm <container-ID>

### see the images
docker image ls
docker images -a
docker images -f dangling=true

### remove image
docker rmi <image-ID>

##AWS
### Set up for AWS ECR
Link to set up for AWS ECR (https://docs.aws.amazon.com/AmazonECR/latest/userguide/get-set-up-for-amazon-ecr.html)
* Sign up for AWS
* Create an IAM User
* Install the AWS CLI

###configure aws cli with access keys
https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html

###Getting started with ECR
https://docs.aws.amazon.com/AmazonECR/latest/userguide/ECR_GetStarted.html 

* Retrieve the docker login command that you can use to authenticate your Docker client to your registry
aws ecr get-login --no-include-email --region [region]

###docker tag

480635166082.dkr.ecr.us-east-2.amazonaws.com/cafe-service
docker tag cafebabe/cafe-service:latest 480635166082.dkr.ecr.us-east-2.amazonaws.com/cafe-service:latest
docker tag cafebabe/search-service:latest 480635166082.dkr.ecr.us-east-2.amazonaws.com/search-service:v1

### docker push
docker push 480635166082.dkr.ecr.us-east-2.amazonaws.com/search-service:v1