# Table of contents:

- [Pre-reqs](#pre-reqs)
- [Getting started](#getting-started)
- [Add maven dependencies](#add-maven-dependencies)
- [Init database](#init-database)
- [Create model](#create-model)
- [Create jpa repository](#create-jpa-repository)
- [Create controller](#create-controller)
# Pre-reqs
To build and run this app locally you will need a few things:
- Install jdk
- Install mysql (any relationship database: postgres, mariadb)
- Install IDE + maven

# Getting started
Init spring boot project
![Screen Shot 2024-06-24 at 02.31.10.png](image%2FScreen%20Shot%202024-06-24%20at%2002.31.10.png)
# Add maven dependencies
See [pom.xml](pom.xml) in project
# Init database

```sql
CREATE TABLE `contact` (
           `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
           `age` int(3) NOT NULL,
           `dob` date NOT NULL,
           `email` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
           `id` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


ALTER TABLE `contact`
    ADD PRIMARY KEY (`id`);


INSERT INTO `contact` (`name`, `age`, `dob`, `email`, `id`) VALUES
('Daniel Jon', 22, '2017-11-15', 'jon@gamil.com', "1d61dd2d-f084-45e5-b561-c50dfed5468b"),
('David Jame', 22, '2017-11-01', 'jame@gmail.com', "d5353061-f51e-4871-9623-37abe50dd14c"),
('Hela', 23, '1997-11-01', 'hela@gmail.com', "884422c6-3839-4052-b1f5-a6a349248a58"),
('Bruno', 25, '1990-11-01', 'bruno@gmail.com', "5d36942d-94e6-4f70-9106-8bd88c445585");

```
## Configure properties
```properties
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/<your_database>
spring.datasource.username=<your_user_name>
spring.datasource.password=<your_password>
```

# Create model
[Contact.java](src%2Fmain%2Fjava%2Fcome%2Ffsoft%2Flecture5%2Ffindolecture5%2Fmodel%2FContact.java)

# Create jpa repository
[ContactRepository.java](src%2Fmain%2Fjava%2Fcome%2Ffsoft%2Flecture5%2Ffindolecture5%2Frepository%2FContactRepository.java)
# Create controller
Declare get, post, put, delete mothods are read, create, update, delete respectively.
```java
@GetMapping // get all contacts
@GetMapping(value = "/{id}") // get contact detail by id
@PostMapping // create new contact
@PutMapping(value = "/{id}") // update by id
@DeleteMapping(value = "/contact/{id}") // delete by id
```