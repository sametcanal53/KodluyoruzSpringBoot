# Kodluyoruz
- Java 18
- Spring Framework
- Spring Boot
- Spring MVC
- Spring Data
- Spring Rest (Http Status)
- Spring Security


## System Login
> Register
> <br>
> Login (username+password)
> <br>
> Authorization (JWT)
## Steps
> Spring Framework
> <br>
> Spring Boot
> <br>
> Spring MVC
> <br>
> Spring Data (JPA Hibernate)
> <br>
> Spring Rest (Restful)
> <br>
> Spring Security


### Reference Documentation
* [Github](https://github.com/sametcanal53/KodluyoruzSpringBoot)
* [H2 Console](http://localhost:8080/h2-console/)
* [Swagger](http://localhost:8080/swagger-ui.html)

```sh
docker
```


## Docker Deployment
```sh
1.ADIM
$     ./mvnw clean package -DskipTests

2.ADIM
$    docker-compose up
$    docker ps


###### POSTMAN ###########
3.ADIM
POSTMAN

//EKLEME
http://localhost:8080/docker/v1/create/product


//LISTELE
http://localhost:8080/docker/v1/list/product


//FIND
http://localhost:8080/docker/v1/find/product/1



//DELETE
http://localhost:8080/docker/v1/delete/product/1


4.ADIM
$    docker exec -it spring_docker_postgresqldb_1 psql -U postgres studentdb


5.ADIM
$    studentdb=#  \dt ==> Tabloları göstermek
$    studentdb=#  select * from product
$    studentdb=#  \q ==> ÇIKIŞ

```