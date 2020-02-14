import React, { useState } from 'react'

const MyMain = (props) => {

    const [count, setCount] = useState(0)


    return(
        <div>
            This is my main
            Hello, my name is {props.name}
            <br></br>
            You Clicked {count} times
            <button onClick={() => setCount(count + 1)}>
                Click me
            </button>
        </div>
    )
}
export default MyMain