# March 31, 2020 - Day 46


## Agenda

- Deploy your backends for the week. 
- Deploy your frontends for the week as well. 

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

### Heroku Deployment

1. First, you need to write `gradlew` in your root. Though you can build your project using `gradlew build` and upload the `.jar`, it's actually simpler to go to your project root and write `heroku create` in a terminal. 

2. In your `application.properties`, make sure you have the following line: `server.port=${PORT:8080}`.

3. Once you've done that, you can simply type `git push heroku master` to push to your heroku remote. Heroku will detect your spring app and build it using gradle! 

4. If you attempt to open your page in Chrome, you'll more than likely get a *whitelabel error*. If you want to test out your api, plug in the URL of your heroku app into postman and test it out that way. Remember to add `/graphql` at the end of the URL. 

## Homework

### Create another Frontend and deploy! 

1. Create another frontend for your Project! You can use whatever framework you want but I'll be sticking with Gatsby. 
2. Hook up your frontend so that it renders content from your backend. Recall that you would need to install `Apollo` and all associated depedencies if you are using Apollo. 
3. Host it on netlify! Follow the steps from friday if you don't remember how to do it. 

## Quote of the Day 
```
 ____________________________________
/ He is now rising from affluence to \
| poverty.                           |
|                                    |
\ -- Mark Twain                      /
 ------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||

```