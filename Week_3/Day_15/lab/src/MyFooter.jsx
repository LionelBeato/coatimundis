import React from 'react'

const MyFooter = (props) => {

let style = {
    color:"blue"
}

    return(
        <div style={style}>
            This is my footer
            <br></br>
            And my favorite color is {props.color}
            <br></br>
            I like to {props.activity}
            <br></br>
            and my favorite movie as a kid was {props.movie}
        </div>
    )
}

export default MyFooter