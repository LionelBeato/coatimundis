# March 2, 2019 - Day 26


## Agenda

- Explore data structures in Java.
- Create a new Spring Boot app for the week. 
- If there's time, explore JUNIT. 

## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 7:30a  | Settling in                      |
| 8:10a  | Slides & Presentation            |
| 9:30a  | Coffee Break                     |
| 9:40a  | Slides & Presentation            |
| 10:00a | Assignment                       |
| 12:00p | Lunch Break                      |
| 1:00p  | Lab Hours                        |
| 3:30p  | Class Dismissed & Office Hours   |

## Lab

### Simple List Practice 

1. Create an ArrayList of at least 10 elements
2. Use an enhanced for loop to iterate through that list and print out each value.
3. Write control flow that checks to see if a specific element is inside the array and print out a statement acknowledging that value (so if you're favorite animal is in an animal list, print out "That's my favorite animal!").
4. Create a simple hashmap with 5 different elements. 
5. Create a LinkedList with 5 different elements.
6. In your LinkedList, set a new value to the middle element. 

## Homework

### Create a Spring App for the week

1. Create a Spring App for this week! Try to use just one model for now.
2. Set up your front end using thymeleaf if you'd like. 
3. Remember to use a Service for your Controller. 

### Achieve full CRUD

1. Implement the correct methods in your service and controller in order to get full CRUD. 
2. Remember that you can use `@getmapping`. `@postmapping`, etc instead of using `@requestmapping`. 
3. Once you have your CRUD tested with Postman or the like, make sure you have the following in your application.properties: 

```.properties
spring.datasource.url=jdbc:h2:~/test
spring.datasource.platform=h2
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.h2.console.enabled=true

# This is for thymeleaf
spring.thymeleaf.template-loader-path: classpath:/templates
spring.thymeleaf.suffix: .html
spring.thymeleaf.cache: false


# Static content cache handling
spring.resources.chain.strategy.content.enabled=true
spring.resources.chain.strategy.content.paths=/**

server.port=${PORT:8080}
```
4. Push it all to GitHub and you're done for today! 


## Links

### Why can you index a LinkedList?

https://stackoverflow.com/questions/21964356/linkedlist-does-not-provide-index-based-access-so-why-does-it-have-getindex-m


### What does String[] args mean?

https://stackoverflow.com/questions/890966/what-is-string-args-parameter-in-main-method-java


## Quote of the Day 
```
 ________________________________________
/ A general leading the State Department \
| resembles a dragon commanding ducks.   |
|                                        |
\ -- New York Times, Jan. 20, 1981       /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||


```