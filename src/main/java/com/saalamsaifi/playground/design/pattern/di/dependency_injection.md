# Java Dependency Injection

> Java Dependency Injection design pattern allows us to remove the hard-coded dependencies and make our application loosely coupled, extendable and maintainable.

Dependency Injection in java requires at least the following:

- Service components should be designed with base class or `interface`. It’s better to prefer interfaces or `abstract` classes that would define contract for the services.
- Consumer classes should be written in terms of service `interface`.
- Injector classes that will initialize the services and then the consumer classes.

Dependency Injection in Java is a way to achieve **Inversion of control (IoC)** in our application by moving objects binding from compile time to runtime.

**Spring Dependency Injection**, **Google Guice** and **Java EE CDI** frameworks facilitate the process of dependency injection through use of **Java Reflection API** and java annotations. All we need is to annotate the field, constructor or setter method and configure them in `configuration.xml` files or classes.

## Benefits

* Separation of Concerns
* Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the injector component
* Configurable components makes application easily extendable
* Unit testing is easy with mock objects

## Disadvantages

* If over used, it can lead to maintenance issues because the effect of changes are known at runtime.
* Dependency injection in java hides the service class dependencies that can lead to runtime errors that would have been caught at compile time.