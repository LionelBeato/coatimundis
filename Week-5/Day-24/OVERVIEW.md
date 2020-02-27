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