# February 28, 2019 - Day 25


## Agenda

- Finally, functional programming in Java!
- Explore *lambdas* and *streams* and how we can utilize them in our code. 
- Dive into the history of *lambda calculus*. 

- Find out what *service* is and what it represents. 
- Review seperation of concerns. 
- Explore hosting options for our Java app.
- Package our Java app into a Jar. 


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

### Lambda Practice

1. In your project, I want you to create an functional interface. Remember that functional interfaces can only have one method. 

2. Create a new instance of your functional interface and write it out as a lambda expression. 

3. Use that lambda expression to print something to the console. 

### Streams Practice

1. In your project, create an ArrayList that takes Integers as elements. Have at least 10 elements. 
2. Using higher order functions and streams, I want you to manipulate every element in the array so that for each element you get back the element plus 5. 
3. Within your stream, print the elements of the stream to your console.
4. Using either another stream or opening the original one again, reduce the elements of the stream in some fashion. 

## Homework

### Create your Service

1. Create a package named `Service`. Under the `Service` package, create the service classes corresponding to your model. 
2. Refactor your controllers so that all business logic is removed and placed in your services. Place an `Autowired` service to the corresponding controllers. 
3. Create new methods for your mapping that return the appropiate methods in your services. The end result will look something like this:

```Java
    @Autowired
    AnimalService animalService;
    // creating our get method for our animals repo
    // this aligns 1:1 with the HTTP GET method
    @RequestMapping( value = "/animals", method= RequestMethod.GET)
    ModelAndView getAnimals(){
        return animalService.getAnimals();
    }

```

### Set-up for Production!

1. in `application.properties`, type in the following value: `server.port=${PORT:8080}`. This will allow heroku to use a dynamic port in order to serve your app.

### Package our App!

1. Using gradle, write `gradlew wrapper` in the root of your app.
2. Write `gradlew build` afterwards. There should now be a .jar file located under `/build/libs`

### Launch our App!

3. Using heroku, go to the `libs` directory where your .jar is located and write `heroku create --no-remote`. There should be a return name--save this for the next step!
4. Next we'll deploy our app! Type in `heroku deploy:jar <app>.jar --app <app-name>` and plug in the .jar name and your heroku app's name. 


## Links

### Clip-Path Generator for clipping images with CSS!

https://bennettfeely.com/clippy/

https://en.wikipedia.org/wiki/Inter-process_communication

https://docs.microsoft.com/en-us/windows/win32/procthread/processes-and-threads

https://web.mit.edu/6.005/www/fa15/classes/19-concurrency/



## Quote of the Day 
```
 _________________________________________
/ There is a certain frame of mind to    \
| which a cemetery is, if not an         |
| antidote, at least an alleviation. If  |
| you are in a fit of the blues, go      |
| nowhere else.                          |
|                                        |
\ -- Robert Louis Stevenson: Immortelles /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||

```