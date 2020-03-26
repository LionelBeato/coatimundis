# March 26, 2019 - Day 44


## Agenda

- Keep refining your Gatsby frontends.
- Add a mutation to your Gatsby frontends. 

## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 7:30a  | Settling in                      |
| 8:10a  | Lab Time                         |
| 9:30a  | Coffee Break                     |
| 9:40a  | Lab Time                         |
| 12:00p | Lunch Break                      |
| 1:00p  | Slides & Presentation            |
| 2:00p  | Assignment                       |
| 3:30p  | Class Dismissed & Office Hours   |

## Lab

### Continue your work on your Gatsby Frontend

1. Keep refining and customizing your frontend.
2. Try to keep in mind the HTML/CSS design principles we established at the start of the class. 

## Homework

1. Hook up your backend mutation to your front end. While Gatsby can render graphql queries, it cannot handle mutations. We would need to use the middleware Apollo to use it. In your project root, go aheads and write the following command to install apollo and all necessary dependencies:

    ```terminal
    npm install apollo-boost @apollo/react-hooks graphql isomorphic-fetch react-apollo
    ```

2. Once that's done, you will need to set up the `ApolloClient` and `ApolloProvider`. These will allow you to utilize Apollo's GraphQL API. Trust me, it's a nicer than the native solution! In your root, create a folder called `apollo` and create two files, `client.js` and `wrap-root-element.js`.  

3. Apollo needs to set up its client and custom fetch method in order to access your API. In your `client.js`, paste the following code: 

    ```JavaScript
    import ApolloClient from 'apollo-boost'
    import fetch from 'isomorphic-fetch'

    export const client = new ApolloClient({
    uri: 'http://localhost:8080/graphql',
    fetch,
    })
    ```

4. Apollo needs to provide certain features and tools to the app. In order to do this, your entire app needs to be enveloped by an `ApolloProvider`. In your `wrap-root-element.js`, paste the following code:

    ```JavaScript
    import React from 'react';
    import { ApolloProvider } from '@apollo/react-hooks';
    import { client } from './client';

    export const wrapRootElement = ({ element }) => (
    <ApolloProvider client={client}>{element}</ApolloProvider>
    );
    ```

5. Now, we need to hook everything up. In your  `gatsby-browser.js` and `gatsby-ssr.js` paste in the following code:

    ```JavaScript
    export { wrapRootElement } from './src/apollo/wrap-root-element';

    ```

6. Alright, we have everything we need to get started but there's one more thing that we need in our backends. We need to configure for CORS. In your Java project, create a Java file named  `CORSFilter` and paste the following code:

    ```Java
    //this component is needed for CORS purposes
    @Component
    public class CORSFilter implements Filter {

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.setHeader("Access-Control-Allow-Origin", "http://localhost:8000");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }



    ```
7. Okay, now that the backend is complete, let's configure our webpage where we will render our data. I have a page named  `arcade.js` that accepts my graphQL API. In that file there is a mutation and a query. These are handled entirely by Apollo:

    ```JavaScript 

    const ADD_GAME = gql`
    mutation ($name: String, $amountOfPlayers: Int) {
    createArcadeGame(name: $name, amountOfPlayers: $amountOfPlayers) {
        name
        amountOfPlayers
    }
    }
    `

    const APOLLO_QUERY = gql`
    {
    arcadeGames{
        id
        name
        amountOfPlayers
    }
    }

    `

    ```

    Take note of the mutation syntax: It's using *variables*. Variables are denoted with a `$`. This mutation is accepting a variable called `name` and a variable called `amountOfPlayers`. These variables are passed into our graphQL "function" named  `createArcadeGames` ass arguments.  

8. In this application, I am utilizing *React hooks*. Specifically, Apollo provides us with a `useMutation` hook. Review the following code and implement it into your code:

    ```JavaScript

    const [ addGame, {data} ] = useMutation(ADD_GAME)

    const handleClick = () => {
        console.log("this works!")
        let n = prompt("please enter arcade game name")
        let a = prompt("please enter amount of players")
        addGame({variables: {name: n, amountOfPlayers: a}})
        window.location.reload(false)
    }

    ```

    Note the `handleClick` function. This function will prompt the user for `name` and `amountOfPlayers` and pass that information as a variable via our custom hook (`addGame`). This is a very elegant solution to passing information into our databases!

9. Now in your JSX, we will need to utilize a custom Query component and a button that is linked to our `handleClick` function. Our implementations will all be different depending on our theming solution. I'm using *Theme-UI* as its the standard for Gatsby apps. Here is my JSX for my `arcade.js` page:

    ```JavaScript
    return (
        <div
        sx={{
            maxWidth: 512,
            mx: 'auto',
            px: 3,
            py: 4,
        }}>
            <Button onClick={handleClick}>
            Hello there
            </Button>

            <Query query={APOLLO_QUERY}>
            {({data, loading, error}) => {
                if (loading) return <span>Loading...</span>
                if (error) return <p>{error.message}</p>

                return <div>
                    {data.arcadeGames.map(el =>
                    <Flex sx={{ p: 3 }}>{el.name}<br></br>
                    Amount of players: {el.amountOfPlayers}
                    </Flex>
                )}
                </div>
                }}
            </Query>
        </div>
    )
    ```

10. In its entirety, here is how my page looks. Your page should look similar: 

    ```JavaScript

    import React, { useState } from 'react';
    import { Link } from "gatsby"
    /** @jsx jsx */
    import { jsx, IconButton } from 'theme-ui'
    import { Flex, Button, Box, Card, Image, Text } from 'theme-ui'
    import { graphql } from 'gatsby'
    import { useMutation } from '@apollo/react-hooks'
    import { Query } from 'react-apollo'
    import gql from 'graphql-tag'



    const ADD_GAME = gql`
    mutation ($name: String, $amountOfPlayers: Int) {
    createArcadeGame(name: $name, amountOfPlayers: $amountOfPlayers) {
        name
        amountOfPlayers
    }
    }
    `

    const APOLLO_QUERY = gql`
    {
    arcadeGames{
        id
        name
        amountOfPlayers
    }
    }

    `

    const ArcadePage = () => {

    const [ addGame, {data} ] = useMutation(ADD_GAME)

    const handleClick = () => {
        console.log("this works!")
        let n = prompt("please enter arcade game name")
        let a = prompt("please enter amount of players")
        addGame({variables: {name: n, amountOfPlayers: a}})
        window.location.reload(false)
    }

    return (
        <div
        sx={{
            maxWidth: 512,
            mx: 'auto',
            px: 3,
            py: 4,
        }}>
        
            <Button onClick={handleClick}>
            Hello there
            </Button>

            {/* this is a custom component from Apollo, note how we're passing our query */}

            <Query query={APOLLO_QUERY}>
            
            {/* imperative code to handle loading, error, and our data  */}
            {({data, loading, error}) => {
                if (loading) return <span>Loading...</span>
                if (error) return <p>{error.message}</p>

                return <div>
                {/* simple map higher order function that will render all of our games */}
                    {data.arcadeGames.map(el =>
                    <Flex sx={{ p: 3 }}>{el.name}<br></br>
                    Amount of players: {el.amountOfPlayers}
                    </Flex>
                )}
                </div>
                }}
            </Query>
        </div>
    )
    }

    export default ArcadePage

    ```

11. I know it's a lot! Don't be afraid to ask me any questions and please let me know if something doesn't work. You should now be able to add entities to your backend. Check with your SQL Client to confirm (I highly recommend using *DataGrip*). 


## Quote of the Day 
```
 ________________________________________
/ Beware of the man who knows the answer \
\ before he understands the question.    /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||


```