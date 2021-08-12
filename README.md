# jAuthService

An authenticator service using JWT, Spring Boot/Security, and PostgreSQL

## How this project was created

This project was initially created using the [spring initializr](https://start.spring.io/), together with the following dependencies:

- [Lombok](https://projectlombok.org/). Java annotation library which helps to reduce boilerplate code.
- [Spring Web](https://spring.io/guides/gs/serving-web-content/). Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa). Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
- [PostgreSQL Driver](https://jdbc.postgresql.org/). A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.
- [Spring Security](https://spring.io/projects/spring-security). Highly customizable authentication and access-control framework for Spring applications.

# Dependencies

- [Maven Project](https://maven.apache.org/)
- [Java 16](http://openjdk.java.net/projects/jdk/16/)
- [Spring Boot 2.5.3](https://spring.io/projects/spring-boot/)
- [PostgreSQL](https://www.postgresql.org/) via [Homebrew preferably](https://formulae.brew.sh/formula/postgresql)

# How to setup this project

Once the dependencies are properly installed, follow the steps below:

- Clone the project locally

```console
    $ git clone https://github.com/ddangelorb/jAuthService.git
    $ cd jAuthService
```

- Start the PostgreSQL and run the scripts to create the database and get the load data.

```console
  $ brew services start postgresql
  $ psql postgres
  postgres=# \conninfo
  postgres=# CREATE DATABASE jauthservice;
  postgres=# \c jauthservice
  jauthservice=# \i db/ddl.sql
  jauthservice=# \i db/sys_config.sql
  jauthservice=# create user ujauthservice;
  jauthservice=# alter user ujauthservice with encrypted password '<your really secure password>';
  jauthservice=# grant all privileges on database jauthservice to ujauthservice;
  jauthservice=#
  jauthservice=# \q
```

- Install dependencies

```console
  $ mvn install
```

- Run the project

```console
  $ mvn spring-boot:run
```


## License

MIT [license](https://github.com/ddangelorb/jAuthService/blob/main/LICENSE)

## Author

[Daniel D'Angelo R. Barros](https://github.com/ddangelorb)
