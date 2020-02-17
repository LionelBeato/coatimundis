import React from 'react';
import logo from './logo.svg';
import './App.css';
import MyComponent from './MyComponent';
import MyFooter from './MyFooter'
import MyMain from './MyMain'


function App() {
  return (
    <div>
      <MyComponent />
    <MyMain name="Lionel" />
    <MyFooter color="blue" activity="code" movie="Toy Story"/>
    </div>
  );
}

export default App;
