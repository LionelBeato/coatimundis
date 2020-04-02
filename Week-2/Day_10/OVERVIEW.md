# February 7, 2020 - Day 10 

This is the OVERVIEW.md or today's class. This file serves as a rough outline of our day. 

## Agenda
---

- Review JavaScript error handling. How do we diagnose errors? What are the best practices?
- Review Try and Catch blocking. 
- Review testing in JavaScript.  
- Cover the importance of accessibility and show some examples (AmplifyCT!)

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
---


### Try and Catch

1. In your script file, create a try and catch block with a function inside of it that hasn't been declared. 
2. Create a custom error messsage that explains why there was an error.
3. Add a try and catch code block to your website for the week! 
4. (Optional) Throw a custom error in your try catch block! 

```javascript
try {
    // this function doesn't exist, so it should throw an error
     myFunc()
} catch (error) {
    // resolves with a console.log()
    console.log(`You just got an error! ${error}`)
}
```

### Accessibility Lab

1. Go back to your website and try to make it accessible. Remember color contrast and text size.
4. Host it on GitHub Pages or use a live server extension (this is needed for Google Lighthouse audits).  
2. Run some tools on your website in order to test it! 
3. Push it to github if it's not already there.


## Homework
--- 

### (Optional!) Slides Example

1. Follow the example in the slides.
2. Use your the chrome dev tools to debug the website. 

### Install Deno

1. Install deno on your computer. Use the following command if you're on Windows and using Chocolately, or on Mac and using homebrew:

```powershell
choco install deno
```

```homebrew
brew install deno 
```

2. We don't need to get into the specifics of deno right now, but just know that we'll be using it for when we get to **TypeScript**. More info will be in the links below.

### Review and Catch-up

1. Review all of the work you did.
2. Catch-up on any labs or homework you didn't do.
3. Push them to github.

## Links 
---

### Contrast Grid

https://contrast-grid.eightshapes.com/

### W3C Accessibility

https://www.w3.org/standards/webdesign/accessibility


### Deno Homepage

https://deno.land/

## Quote of the day
---
>*“Talk is cheap. Show me the code.” ― Linus Torvalds*

