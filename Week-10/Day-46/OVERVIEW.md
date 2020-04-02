# March 30, 2020 - Day 46


## Agenda

- Create a new GraphQL backend for the week. 

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

### Create a new Backend! 

1. Let's create a new GraphQL backend, this time utilizing h2 for more rapid development. Go to [https://start.spring.io/](the Sring Initializer) and select the following: 
    - Spring Web
    - Spring Data JPA
    - H2 Database
2. Once that's done, in your projects build.gradle add the following line to your dependencies:

```groovy
	implementation 'com.graphql-java:graphql-java:11.0'
	implementation 'com.graphql-java:graphql-java-spring-boot-starter-webmvc:1.0'
	implementation 'com.google.guava:guava:26.0-jre'
```
3. Continue iterating on what you learned to make a new app that serves some sort of content. 

## Homework

### React Practice

1. Lets practice some React! Using `npx create-react-app`, make a new React project. 
2. Make a new component and create props for it. Have the component render the value of its props to the DOM. 
3. In your `App.js` call the component and define its props! 

## Quote of the Day 
```
 _____________________________________
/ Maryann's Law:                      \
|                                     |
| You can always find what you're not |
\ looking for.                        /
 -------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```