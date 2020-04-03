# April 3, 2020 - Day 50


## Agenda

- Format our paragraphs so that they respect whitespace. 
- Hook up our mutation, creating a custom popup prompt for our frontends. 



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

### Formatting paragraph

1. Let's have our paragraph in our posts formatted. First, just make sure your app is up and running and your query works. 

2. Then, go back to your backend and write out your three `txt` files. Feel free to use whitespace and tabs!

3. Now, in our front ends, go to wherever your content is being renderd and add the following to the parent element: `style={{whiteSpace:"pre-line"}}`. I have a `Post` component that looks something like this: 

    ```JavaScript

    import React from "react"
    import { Flex, Container } from "theme-ui"
    /** @jsx jsx */
    import { jsx } from "theme-ui"

    export const Post = props => {
    return (
        <Container
        p={4}
        bg="muted"
        style={{
            whiteSpace: "pre-line",
        }}
        >
        <h2>{props.title}</h2>
        <h4>{props.date}</h4>
        <p>{props.body}</p>
        </Container>
    )
    }
    ```



## Homework

### Let's Create a Prompt 

1. We will need to create prompt for our backend mutation on the frontend. In order for this to work, we need to think of logical solutions that can address our problem. I'm opting to use a *modal* for this purpose. There just so happens to be a dependency that handles modals for us using react. Go ahead and type the following into your terminal:

    ```Shell
    npm i react-modal
    ```

2. Now we need to utilize a Form of some sort. I'm using theme-ui's form boilerplate but feel free to augment the code to whatever framework you're using. 

3. Before we implement our form we will need to define our mutations. I have written out the following *operation* for my createPost mutation:

    ```GraphQL

    const ADD_POST = gql`
    mutation($title: String, $body: String) {
        createPost(title: $title, body: $body) {
        title
        date
        body
        }
    }
    `
    ```

4. Moving on, let's now go ahead and define our states. We will be using four states to handle all of our front end logic and changes. If your page doesn't have a traditional function body( e.g. `{ }` ), add some and wrap the JSX around a return statement ( e. g. `return ( JSX_GOES_HERE )` ). I have defined the following hooks:

    ```JavaScript
    const [modal, setModal] = useState(false)
    const [addPost, { data }] = useMutation(ADD_POST)
    const [title, setTitle] = useState("")
    const [body, setBody] = useState("")
    ```

    Take note of the `useMutation` syntax. You will need to import this hook from Apollo like so: `import { useMutation } from "@apollo/react-hooks"`.

5. Now we need to define function that will handle our changes and events on the DOM side. Observe the following code:

    ```JSX
    const bodyHandler = event => {
    setBody(event.target.value)
    }

    const titleHandler = event => {
    setTitle(event.target.value)
    }

    const handleClick = () => {
    setModal(!modal)
    }

    const handleForm = () => {
    let t = title
    let b = body
    addPost({ variables: { title: t, body: b } })
    handleClick()
    }
    ```

    Note the `event` variable being passed into the first two functions. This represents whatever action happens to an element at any given time. We can extract the value of an element by targeting this event variable like so: `event.target.value`. 

6. To wrap up the front end portion, we need to define our modal in JSX. Here I have my defined modal with *theme-ui* code:

    ```JSX
      return (

        <ReactModal isOpen={modal}>
        <Box as="form" onSubmit={handleForm}>
          <Label htmlFor="title">Title</Label>
          <Input name="title" mb={3} onChange={titleHandler} />
          <Box></Box>
          <Label htmlFor="body">Body</Label>
          <Textarea name="body" rows="6" mb={3} onChange={bodyHandler} />
          <Button>Submit</Button>
          <Button sx={{ float: "right" }}>Cancel</Button>
        </Box>
      </ReactModal>

      {/*other stuff here*/}
      )
    ```

    There should be equivilant elements in whatever framework you're using. The element `<Box>` is analogous to the `container` class in most frameworks.  

7. Once last thing! We need to add a line of code to our backend datafetcher mutation method. Add the following to `createPost` before your return statement: 

   ```Java
                posts = StreamSupport
                    .stream(postRepo.findAll().spliterator(), false)
                    .collect(Collectors.toList());
   ```

8. And you're done! Test it out and see if it works! You may have noticed that it doesn't auto update. You will need to reload the page in order for Apollo to fetch the relevant data again. There is a simple solution to this that we implemented in our last gatsby project. Take a look at that one and try and figure it out!

## Quote of the Day 
```
 _________________________________________
/ When you say that you agree to a thing  \
| in principle, you mean that you have    |
| not the slightest intention of carrying |
| it out in practice.                     |
|                                         |
\ -- Otto Von Bismarck                    /
 -----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||

```