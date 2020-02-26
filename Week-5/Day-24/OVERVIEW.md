# February 24, 2019 - Day 21


## Agenda



## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 7:30a  | Settling in                      |
| 8:10a  | Slides & Presentation            |
| 9:30a  | Coffee Break                     |
| 9:40a  | Slides & Presentation            |
| 9:50a  | Assignment                       |
| 12:00p | Lunch Break                      |
| 1:00p  | Lab Hours                        |
| 3:30p  | Class Dismissed & Office Hours   |


## Lab

### Control Flow Practice

1. In a Java Project, create a block of code that will only work if a variable is set to `true`.
2. Create an Array (or List) and loop through that array using an enchanced for loop. 
3. Have a block of code that will execute inside of a do-while loop.
4. Write a switch statement with a default case. 

## Homework

### Time for Thymeleaf (for real, this time!)

1. Refactor your code so that thymeleaf is correctly configured. In your Controller class have your get method mirror the follow:

```Java
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView getAnimals(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("animals", animalRepo.findAll());
        return mav;
    }
```

2. Move your html to your template folder and add this following lines:

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




## Links



## Quote of the Day 
>_________________________________________
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
