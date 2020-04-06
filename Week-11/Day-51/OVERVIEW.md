# April 6, 2020 - Day 51


## Agenda

- Practice some frontend fundamentals.
- Continue iterating on your Gatsby frontend. What are some ideas you may have for it? 
- Take the opportunity to think about anything else you may want to cover! 

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

### Frontend Practice

1. I know it's been a while since we've practice our front end fundamentals. So lets go ahead and do just that! Make a new folder and in that folder create your `index.html`, `script.js`, and `style.css`.

2. Link your `script.js` and `style.css` to your `index.html`. If you want, you can use a front end framework for style. 

3. Add the essential elements of a page to your `index.html` (footer, navbar, main, etc). 

4. (Optional but highly encouraged) Practice writing react code and try to create another webpage using react. Use `npx create-react-app` for rapid development. 


## Homework

### Setup PostgresQL in your backend

1. Ideally, we should be using some sort of database solution for our backends. Thankfully, heroku provides a free solution that utitlizes *PostgresQL*, a different SQL implementation. Go to your app's dashboard on heroku and click on resources. Now in the searchbox under "add-ons," search for "postgres."

2. In the results, select "Heroku Postgres." There should now be a modal prompting you about the addition. Go ahead and click on the "provision" button. Once it's added, click on the add-on.  

3. Click on "Settings" and take a look at what's there. You should now be seeing your database credentials. Let's see if we can test it out! Use a SQL client like *Data Grip* in order to see if a connection to your database works. You will need to create a new table under the default schema "public." Create the columns that will correspond to your entity's fields.  

4. Go to your backend project and add in the following dependency in your build.gradle:`implementation('org.postgresql:postgresql')`

5. Once you've confirmed the database is able to be queried, go to your `application.properties` in your backend and plug in the appropiate values from your database. Take note that there's a special syntax to how your database is connected, let's take a look at my file: 

    ```s

    # url defines our actual location for our database and is structured like so: 
    # jdbc:postgresql//<database_URL>:<PORT>/<database>?currentSchema=<schema>
    spring.datasource.url=jdbc:postgresql://ec2-18-235-97-230.compute-1.amazonaws.com:5432/d5bhdevcpmh0u5?currentSchema=public

    # this tells spring that we're using postgresql
    spring.datasource.platform=postgres
    spring.datasource.username=tlybkduzlamivv
    spring.datasource.password=f5143264972578f73d13ab99cd2f90486df351c1c92f37f2511cf869624f114a

    # specifies the driver used 
    spring.datasource.driver-class-name=org.postgresql.Driver

    # enforces a SQL dialect 
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect


    # enabling the h2 console for quick viewing of our database 
    spring.h2.console.enabled=true

    # this is a setting for heroku allowing for a dynamic port on their end
    server.port=${PORT:8080}
    ```

    Take note of how the url is declared. First the URL is given, then the port, then the database within our postgresQL server, and finally the schema. All of this needed in order for our app to work! 

6. Now go into your model and add in the following annotation: `@Table(name="posts")`. This tells Spring which table to utilize in your database. 

7. Go ahead and see if your app works. Push everything to heroku and test a query in postman. You now have a discrete backend! Feel free to expand on it by adding more tables/entities or refining the fields of the models that you have. 


## Quote of the Day 
```
 ________________________________________
/ Opportunities are usually disguised as \
| hard work, so most people don't        |
\ recognize them.                        /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||


```