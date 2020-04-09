# April 6, 2020 - Day 53


## Agenda

- Implement a backend for your graphql spring boot app! 

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

### Catch-up and Front-End refinements 

1. Take this time to catch up with any assignments you may not have done. 
2. Keep working on your frontends. Remember to break up your elements into components if you can! 


## Homework 

### Firebase!!

1. Let's install firebase. Firebase utilizes a command line interface that is provided to us through `npm`. Use `npm install -g firebase-tools` at your terminal to install firebase globally. If you're on Windows and it's not working try the command `npm install -g windows-build-tools` in conjunction with installing `firebase-tools`. 

2. Create a firebase project at [firebase.google.com](firebase.google.com). Click on "get started" and then click "add project". Navigate through the default options for your project. 

3. Make an empty folder and write the command `firebase login` in order to login to your firebase account and then `firebase init hosting` in that folder. Go through the options. It will prompt you for a public directory; simply hit enter for the default. Enter `y` to configure as a single page app. 

4. You can immediate serve the app using `firebase serve`. You can even immediately deploy using `firebase deploy`. For now let's serve this app. Take note of what you see in your browser. The default URL should be `localhost:5000`. The app will have hot reloading enabled by default, so there's no need to re-serve or reload your webpage. 

5. Let's now remove the boilerplate that is in our `index.html` under the folder `public`. Remove everything in the script tag and all of the elements within the `<body>` tag. Feel free to remove the styling as well.

6. Create an `app.js` in your public directory and link it to your `index.html`. Just to be certain things load in the appropiate order, insert the `app.js` script element at the bottom of your body. 

7. Enable the authentication method. We'll be using Google to login into our app. On your firebase dashboard, click on the `authentication` section. Next, click on `set up sign-in method`. Click on Google and enter your gmail under `Project support email`. Finally, click on `enable.` 

8. We can now write our login function. Fill out `app.js` with this following block of code: 

    ```JavaScript

    document.addEventListener("DOMContentLoaded", event => {
        const app = firebase.app()

    })

    const googleLogin = () => {

        const provider = new firebase.auth.GoogleAuthProvider()
        
        firebase.auth().signInWithPopup(provider)
        .then(result => {
            const user = result.user
            document.write(`Hello ${user.displayName}`)
            console.log(user)
        })
        .catch(console.log)

    }
    ```
    Here we have two functions. The first is an event listener that initialize our firebase app. This initialization holds many services that will be useful to us at a later point.  The second function allows us to do something with our google authentication provider. `signInWithPopup` returns a promise that we can then utilize to perform an asynchronous operation such as displaying a username. 


9. Try logging in yourself! If things are set up correctly, your name should be displayed on the page after you login. 





## Quote of the Day 
```
 _________________________________
/ April is the cruellest month... \
|                                 |
\ -- Thomas Stearns Eliot         /
 ---------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||

```