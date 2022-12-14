# How to Setup HashiCorp Vault With Spring Boot Application

<a href="https://www.javatodev.com/hashicorp-vault-spring-boot/" target="blank">
    <img align="center" src="https://www.javatodev.com/content/images/size/w2000/2022/12/How-to-Setup-HashiCorp-Vault-With-Spring-Boot-Application--1-.png" alt="How to Setup HashiCorp Vault With Spring Boot Application"/></a>

<p align="left">
    Assume we need to setup secure storage for our application tokens, passwords or any other secret and sensitive data.

HashiCorp vault allows us to setup secure access to those sensitive data with reduce the risk of breaches and data exposure with identity-based security automation and encryption-as-a-service.

In this article we are going to learn how we can setup HashiCorp vault with spring boot application to store and retrieve application secrets and few other sensitive configuration values in secure way.
</p>

### Main Topics

- Setup HashiCorp Vault
- Creating Secrets on Vault
- Spring Boot Application With Vault Configuration
  - Application Configurations
  - Load Properties With @ConfigurationProperties to Spring Boot
  - Spring Boot Profile Support
  - Build and Startup Application
- Conclusion

📄 Original Tutorial [How to Setup HashiCorp Vault With Spring Boot Application](https://www.javatodev.com/hashicorp-vault-spring-boot/)

Related Articles

- [Spring Boot REST API CRUD With DynamoDB Tutorial](https://www.javatodev.com/spring-boot-dynamo-db-crud-tutorial/)
- [Task Scheduling on Spring Boot Using @Scheduler](https://www.javatodev.com/how-to-use-scheduler-annotation-in-spring-boot/)
- [Spring Boot REST API CRUD With DynamoDB Tutorial](https://javatodev.com/spring-boot-dynamo-db-crud-tutorial/)
- [Spring Boot REST API Using JPA, Hibernate, MySQL Tutorial](https://javatodev.com/spring-boot-mysql/)
- [Database Migration Using Flyway in Spring Boot](https://javatodev.com/flyway-spring-boot/)
- [How to Use Amazon SQS With Spring Boot](https://www.javatodev.com/how-to-use-amazon-sqs-with-spring-boot/)

