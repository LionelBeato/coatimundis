# March 17, 2019 - Day 37


## Agenda

- Practice more SQL.

## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 7:30a  | Settling in                      |
| 8:10a  | Lab Time                         |
| 9:30a  | Coffee Break                     |
| 9:40a  | Lab Time                         |
| 12:00p | Lunch Break                      |
| 1:00p  | Slides & Presentation            |
| 2:00p  | Assignment                       |
| 3:30p  | Class Dismissed & Office Hours   |

## Lab

### Complete SQL Assignment from the day prior

1. Complete your SQL assignment using the world pop csv.
2. If you have time, practice SQL commands with your own data from mockaroo. 

## Homework

### Work on Gatsby

1. Work on your Gatsby frontends so that it's ready to consume your data from the backend.
2. Pick how you'll render your data (tabular rows? elements?). 
3. Make sure to follow the theming guidelines for your CSS framework and remember to write things out with React rules and guidelines in mind. 

### SQL integration 

1. So now, let's integrate mariaDB/mySQL into our backends. We start by copying this code into our `build.gradle`:

```gradle
	implementation 'org.mariadb.jdbc:mariadb-java-client:2.1.2'
```

2. After that, make sure your `application.properties` mirrors mine like so: 

```application.properties
spring.datasource.url=jdbc:mariadb://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
```

3. Now you need to make sure there's somewhere to put your data. In your SQL client, create a schema/database called `test`.
4. Under `test`, create tables for your models with columns that correspond with the fields in your models. Keep in mind that camelCase code will be converted to snake_case code like so: `helloThere => hello_there`. SQL uses snake_case.
5. In your model, add an annotation called `table` and specify the table name you passed into your database. Also change the id generation type to `IDENTITY`. Your model will look something like this:

```Java
package com.example.graphqlproject.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="arcade_games")
public class ArcadeGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    // boiler-plate and other fields down here

```

6. Run your springboot app and see if your table was filled. If it was, the connection worked! Now we need to remove the runner and add the data dynamically instead of at runtime. 



## Links




## Quote of the Day 
```

 ________________________________________
/ Question: Is it better to abide by the \
| rules until they're changed or help    |
\ speed the change by breaking them?     /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||


```