# February 27, 2019 - Day 24


## Agenda

- Explore Java *control flow* and the basic conditionals. 
- Explore *thymeleaf*, why we would use it, and how to implement it. 
- Enable *H2* database and explore database tooling options such as *HAL Browser*. 

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

### Control Flow Practice

1. In a Java Project, create a block of code that will only work if a variable is set to `true`.
2. Create an Array (or List) and loop through that array using an enhanced for loop. 
3. Have a block of code that will execute inside of a do-while loop.
4. Write a switch statement with a default case. 

## Homework

### Time for Thymeleaf (for real, this time!)

1. Refactor your code so that thymeleaf is correctly configured. In your Controller class have your get method mirror the following:

```Java
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView getAnimals(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("animals", animalRepo.findAll());
        return mav;
    }
```

2. Move your html to your template folder under `resources` and add the following lines:

```HTML
<!-- Change your html tag to the following: -->
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<!-- the xmlns attribute gives us a namespace so that we can use the th attribute -->

<li th:each=" animal : ${animals}">
    <h1 th:text="${animal.name}">

    </h1>

```

3. In order for everything to work, add the following to your application.properties: 


 ```.properties
spring.thymeleaf.template-loader-path: classpath:/templates
spring.thymeleaf.suffix: .html
spring.thymeleaf.cache: false

```

### Enable H2! 

1. In your application.properties, make sure you have the following code:
```.properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=test
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.h2.console.enabled=true
```
2. Note the username and password settings. 
3. Launch your spring boot app and go to `localhost:8080/h2-console`. For the url insert `jdbc:h2:mem:testdb` and for the the password, insert `test`. 
4. You should now be in a SQL style application. In here you can write legal SQL queries. Try the query `select * from <INSERT TABLE NAME HERE>`to see what it generates! 
5. Note that we're using a test database that's stored in memory, ergo `h2:mem:testdb` where `testdb` is the database name. Spring supports a wide assortment of SQL *flavors* and database technologies, including cloud stacks and mongodb. 

### Refactor Your Spring App

1. Continue refactoring your spring app so that you have packages and seperation of concerns. 
2. Make sure your html is inside your template folder! 
3. Continue refining your front end so that it's visual cohesive and pleasing (remember accessibility!). 
4. Push everything to GitHub by the end of the day.  


## Links

### Conditionals Are a Code Smell

https://levelup.gitconnected.com/conditional-statements-are-a-code-smell-here-is-your-relief-38e50c023708


## Quote of the Day 
````
 _________________________________________
/ There is an innocence in admiration; it \
| is found in those to whom it has not    |
| yet occurred that they, too, might be   |
| admired some day.                       |
|                                         |
\ -- Friedrich Nietzsche                  /
 -----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||

````