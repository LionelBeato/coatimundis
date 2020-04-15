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

## Homework

### Create your Portfolio Site 


1. Using whatever technology you want, create your portfolio site where you can express yourself and showcase your work! 
2. Start thinking about your strengths and weaknesses and how you want to write about yourself on your resume.  

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