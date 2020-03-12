# March 12, 2019 - Day 34


## Agenda

- Find out what Web Services are.
- Dive deep into SOAP, REST, XML, and GraphQL. 


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

### Web Service Practice

1. In a Java Project, Open up a ServerSocket that will expose a port like so:

    ```Java
            final ServerSocket server = new ServerSocket(8080);

    ```

2. In a while loop, use try with with resources to render a webpage. Your resource will be defined as `server.accept()`:

    ```Java
         while (true) {
            try (Socket socket = server.accept()) {
                Date today = new Date();
                // this string renders static content after the 200 OK message
                // theoretically, you can render static web pages via this method
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n"+"<h1>Hello</h1> <div>I'm inside a div!<div>";
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }

    ```

3. The is your basic structure for a web service. In Java, it's much more verbose than in JavaScript! The lesson here is that sockets are pretty much what defines the web/internet. Whenever you look at page, think about the backend code that is allowing that page to render. 

4. The original implementation had the date render to a webpage. See if you can edit the code so that it renders the value of `today`. 


## Homework

### Simple GraphQL backend

1. Set up your GraphQL backend so that it mirrors my project. 
2. Make sure you have your model and DAO/Repository set up and defined so that we can use them with GraphQL.
3. Edit the schema so that there's a type that matches our model and create a query for it.
4. Edit the DataFetchers so that it's retrieving the data defined by the DAO/Repository class. 


## Links

## Quote of the Day 
```
 ________________________________________
/ Let's organize this thing and take all \
\ the fun out of it.                     /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```