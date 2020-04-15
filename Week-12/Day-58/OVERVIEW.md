# April 15, 2020 - Day 58

## Agenda

- Improve and iterate on your frontend. 
- Start to tackle our resumes and portfolio sites. 

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

### Continue iterating on your Frontend and how to Line Clamp

1. Keep working on your frontend blog! Oh, and if you want to truncate your blog entries, there are a few methods of doing this. This process is typically referred to as "clamping." I selected one method using css. Here is my line-clamp class in my global.css file:

    ```CSS
    .line-clamp {
        display: -webkit-box;
        -webkit-line-clamp: 3;
        -webkit-box-orient: vertical;  
        overflow: hidden;
    }
    ```

2. The next step would be to simply give the body element of your post the `line-clamp` class. I passed that value as a prop. Here is my `post.js` code fragment:

    ```JSX
    <p className={props.bodyStyle} >{props.body}</p>
    ```

    And here is my Post component inside of my page:

    ```JSX
    <Post bodyStyle="line-clamp" title={el.title} date={el.date} body={el.body} />
    ```

3. You may be wondering how you would expand the post. There are many ways to do this but one solid method would be to add a modal that contains the full text of the post inside of `post.js`. Your `post.js` would then need to handle the modal state via the `useState()` hook. It will also need its own `handleClick` method. For brevity's sake, here's the entirety of my `post.js`:

    ```JSX
    import React, { useState } from "react"
    import { Flex, Container, Button } from "theme-ui"
    /** @jsx jsx */
    import { jsx } from "theme-ui"
    import "../styles/global.css"
    import ReactModal from "react-modal"


    export const Post = props => {

    const [modal, setModal] = useState(false)

    const handleClick = () => {
        console.log("this works")
        setModal(!modal)
    }



    return (
        <div>

        {/* modal code for my post, clicking on the "close" button
            or the post title will dismiss the modal */}
        <ReactModal isOpen={modal}>
        <Button onClick={handleClick}  sx={{float: "right"}}>close</Button>
        <h2 className="title" onClick={handleClick} className="title">{props.title}</h2>
            <h4>{props.date}</h4>
            <p>{props.body}</p>
        </ReactModal>

        <Container
            p={4}
            bg="muted"
            sx={{
            whiteSpace: "pre-line",
            }}
        >

            {/* code for opening the post as a modal, the title will appear
                clickable because of the title css class */}
            <h2 onClick={handleClick} className="title">{props.title}</h2>
            <h4>{props.date}</h4>
            <p className={props.bodyStyle} >{props.body}</p>
        </Container>
        </div>

    )
    }

    ```

    This method works completely fine but is a bit a of a hack. Note that my `handleClick` is set to my post title so if I click it, I am able to to open the modal (and also close it!). 

## Homework


### Paging and Sorting

1. Our project currently has a limited amount of entities to handle, so it's fine that we render them all on one page. However, what if we were to have 25 entities, or 100, or even 500? That single page would be very long and probably very slow. This is where pagination comes in. 

2. MORE COMING SOON :) 

### Create your Portfolio Site 


1. Using whatever technology you want, create your portfolio site where you can express yourself and showcase your work! 
2. Start thinking about your strengths and weaknesses and how you want to write about yourself on your resume.  
3. If you need some inspiration, take a look at my quick and [dirty personal site](https://fds3sd.web.app/). It still needs to be exanded upon but I believe its a decent example of what I want to start seeing.

## Quote of the Day 
```
 _________________________________
/ To laugh at men of sense is the \
\ privilege of fools.             /
 ---------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||

```