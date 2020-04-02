# April 2, 2020 - Day 49


## Agenda

- Write out some blog posts for your post api if you haven't done so already.
- Lets set up a mutation; we'll attempt to add a new post with our API! 

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

### Write post content and continue styling!

1. If you copied my model, let's customize your posts so that they say something about you. We can start by creating a folder in `resources` named `posts`. 

2. Then go ahead and create three files (`first.txt`, `second.txt`, etc) inside of `posts`. 

3. You will need to adjust your `Runner` class and `Post` model. In your `Runner` add the following block of code:

```Java
import java.io.*;
import java.util.Scanner;

// ... 

ClassLoader cl = this.getClass().getClassLoader();
    InputStream inputStreamOne = cl.getResourceAsStream("posts/first.txt");
    InputStream inputStreamTwo = cl.getResourceAsStream("posts/second.txt");
    InputStream inputStreamThree = cl.getResourceAsStream("posts/third.txt");


    Scanner scannerOne = new Scanner(inputStreamOne);
    Scanner scannerTwo = new Scanner(inputStreamTwo);
    Scanner scannerThree = new Scanner(inputStreamThree);

    public Runner() throws IOException {
    }

```

ClassLoader is used to load classes into our program but it can handle resources as well. Specifically, it handles resources as a stream, ergo the method `getResourceAsStream`. We pass in our resource path into it as a string. The Scanners take in our streams as arguments, allowing us to later render the data. The default constructor simply allows us to have the class throw an error; this is necessary for our InputStreams to work. 

4. Add the following code to your `run` method:

```Java
String textOne = scannerOne.useDelimiter("\\A").next();
        String textTwo = scannerTwo.useDelimiter("\\A").next();
        String textThree = scannerThree.useDelimiter("\\A").next();
```

This code allows our scanner to intrepet the content of our files as a string, and stops at the escaping character `\\A`, ending the stream. 

5. In your `run` method, change the constructors for each new post so that it accepts our Strings that we defined in the previous step. It will look like this:

```Java
        postRepo.save(new Post(sdf.format(new Date()), "hello", textOne));
        postRepo.save(new Post(sdf.format(new Date()), "new post", textTwo));
        postRepo.save(new Post(sdf.format(new Date()), "other rambling", textThree));
```

6. Now, in your `Post` model, we need to change the way H2 handles our `body` field. We can do this using annotations. Above `body` add the following annotations: `@Column(name = "body", columnDefinition="TEXT")`. Here, we're defining a custom name for our SQL column and defining it. We want to use "TEXT" because the "TEXT" definition has an indefinite limit for an amount of characters. This is perfect for our blog! 

7. After committing, go ahead and `git push heroku master` and see if it deployed successfully! Test out your API in Postman. 

## Quote of the Day 
```
 ________________________________________
/ Dopeler effect:                        \
|                                        |
| The tendency of stupid ideas to seem   |
\ smarter when they come at you rapidly. /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||

```