# Library API
**A  Java and mongoDB based RESTful API for storing and managing library information, including the data of the libraries, members, staff and all books.**


## Documentation

You can find the whole documentation with the endpoints [here](https://documenter.getpostman.com/view/21245730/Uz5DqxEA).


## Deployment

### Pre-requirement

- Create a mongoDB database with four collections:

```
📦libraryDB
 ┣ 📂 libraries
 ┣ 📂 staff
 ┣ 📂 members
 ┗ 📂 books
```
- Personalise and add this documentum into "staff" (after deploying with these credentials you will be able to make requests):
```
{

    "userName": "",
    "password": "",
    "userRoles": [
        {
            "role": {
                "name": "ADMIN"
            }
        }
    ],
    "name": "",
    "emailAddress": "",
    "libraryId": "",
    "_class": "com.csrlnd.LibraryAPI.Model.Staff"
}
```
### Installation

- Clone this git repository.
```sh 
git clone https://github.com/rolandcsosz/Library-API.git
```
- Change Directory
```sh 
cd Library-API
```


### Configuration

Add values to connection variables by editing  the  `application.properties` file in the project: 

```
spring.data.mongodb.host=
spring.data.mongodb.port=
spring.data.mongodb.authentication-database=
spring.data.mongodb.username=
spring.data.mongodb.password=
spring.data.mongodb.database=
```

### Configuration Values
- `host` - Name/ip adress of the host
- `port` - The port 
- `mongodb.authentication-database` - The database for authentication
- `username` - The username
- `password` - The password
- `database` - The database


### Deploy using Maven
- Build the project and create a runnable jar file: 
```sh 
 mvn package
```
- Run the solution:
```sh 
java -jar target/Library-API-1.0.0-SNAPSHOT.jar com.rolandcsosz.LibraryAPI.Main
```



##  Copyright & License

- Copyright (©) 2022 by [Csősz Roalnd](https://github.com/rolandcsosz)

- Licensed under the terms of the [GNU GENERAL PUBLIC LICENSE Version 2, June 1991](./LICENSE)

