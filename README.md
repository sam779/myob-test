README

This application is a simple implementation of a REST api using Spring Boot Framework.

To deploy the application, run the following commands:

```
docker build -t myob-rest-api -f ./docker/Dockerfile .

docker run -d  -p 8080:8080 myob-rest-api:latest
```

Alternatively, you can run the `deploy` file.


The main routine sits in <code>MyobRestApiApplication.java</code>. There are three functionalities associated to three links:

1- <code> http://localhost:8080/ </code>, which returns the <code>Hello World!</code> response.

2- <code> http://localhost:8080/health </code>, which returns the health of the api. If the return code is 200, it means that the link is up. Otherwise, the link will be assumed down.

3- <code> http://localhost:8080/about </code>, which returns the application details.