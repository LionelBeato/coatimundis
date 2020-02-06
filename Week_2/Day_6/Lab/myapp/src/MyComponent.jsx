import React from 'react';
import ReactDOM from 'react-dom';

const MyComponent = () => {

    let myName = "Lionel"
    let myHobby = "I really, really like to code."

    return (
        <div>
            <p>My name is {myName} and {myHobby}</p>
        </div>
    )
}

export default MyComponent
