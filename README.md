# dubbo-spring-boot-demo
A simply spring boot driven Dubbo demo project.

## Introduction
We've got three modules in this demo project, two Consumer modules and one Provider module:
* provider, known as the server side of Dubbo, which provides the Dubbo service and register service to the Registry.
* consumer, known as the client side of Dubbo, which can find and consume the service provided by provider automatically by subscribing to the same Registry.
* consumer-filter, same as the consumer module but shows you the usage of Dubbo's SPI extension point.

## Run the demo
1. Start the Provider
Enter the provider module, run
```bash
./mvnw spring-boot:run
```

2. Start the Consumer
Enter one of the consumer module, run
```bash
./mvnw spring-boot:run
```

## Links

* [Dubbo](https://github.com/apache/incubator-dubbo)
* [Dubbo Spring Boot](https://github.com/apache/incubator-dubbo-spring-boot-project) - Spring Boot Project for Dubbo.
* [Developer Mailing list](https://github.com/apache/incubator-dubbo/issues/1393) - Any questions or suggestions? [Subscribe](https://github.com/apache/incubator-dubbo/issues/1393) to (dev@dubbo.incubator.apache.org) to discuss with us.
* [Gitter channel](https://gitter.im/alibaba/dubbo) - Online chat room with Dubbo developers.
* [Dubbo user manual(English)](http://dubbo.apache.org/books/dubbo-user-book-en/) or [Dubbo用户手册(中文)](http://dubbo.apache.org/books/dubbo-user-book/) - Describe how to use Dubbo and all features of Dubbo concretely.
* [Dubbo developer guide(English)](http://dubbo.apache.org/books/dubbo-dev-book-en/) or [Dubbo开发手册(中文)](http://dubbo.apache.org/books/dubbo-dev-book/) - Detailly introduce the design principal, extension mechanisms, code conventions, version control and building project, etc.
* [Dubbo admin manual(English)](http://dubbo.apache.org/books/dubbo-admin-book-en/) or [Dubbo管理手册(中文)](http://dubbo.apache.org/books/dubbo-admin-book/) - Describe how to use Dubbo registry and admin-console.
