// This is how you'd write a comment in JS
/* You can also write a block comment like this */

// In any coding language, you would declare something called a variable
// variables are symbols that represent a value
// think of the variable as pointing to the value you assigned it
// to declare a variable, you need the declaration syntax
// you can use let, const, or var (var is discouraged)
// all variables need an identifier when declared, think of this as a "name"
// variables should also be assigned a value but they can be declared without one in some circumstances and other languages


let x = 4
let y
// take note that you don't need semicolons in js
// js will still parse the semicolon as the end of a "statement"
// statements can be refered to as a single line of code

//semicolons will allow you to chain code on one line
let foo = 4; let bar = 2

// console.log() is what we use to print something to the console or terminal
// below will print as undefined because this variable was not assigned a value
// note that undefined is a value unto itself
console.log(y)

// variables can be mutable or immutable, meaning they be altered or not 
// const does not mean immutable, it means that the variable will always have a reference to the same value
const z = 3
// below will throw an error
// when we have code that will throw an error or corrupts the code, it's refered to as illegal
try{
    // this is a try-catch block
    // we attempt the code in the try block
    // if this code throws an error, we can catch it below
z = 2
} catch(e){
    // here we catch the error thrown as the variable "e"
    // this variable can be declared whatever, but its best practice to call it "e" or "error"
    console.log(`${e} You can't do that!`)
}

// because we caught our error, our code will continue to run

try{
    // you can explicitly throw an error
    // this can be useful for debugging and learning coding practices 
    throw "This is a custom error!"
    // this code will never be reached because an error was previously thrown
    throw 500
} catch (e){
    // e will always refer to the error thrown above
    console.log(`${e} Thank you for the error!`)
}

console.log(z+1)

/* Data Structures */

// JavaScript has many kinds of data structures that can be utilized

// Variables are assigned by value
// other major data structures are assigned by reference
// reference variables points to an object in memory
// variable values can be what we call a primitive type
// primitive types are data that are not considered objects and have no methods
// the seven major primitives are:

// string
// number
// bigint
// boolean
// null
// undefined
// symbol 

// the major reference data structures include but are not limited to:

// array
// arrays can be composed of any data type, but all elements need to be the same type
let arr = [1, 3, 3, 5, 6]
console.log(arr)

// object
// note that objects are chiefly composed of key value pairs
// the values can be anything, including other objects

let obj = {
    name: "Leo",
    age: "29"
}

console.log(obj)

// class

// classes are an object oriented data structure that can be thought of as blueprints for objects

class Dog {

    // these variables are what we call members of the class 
    age
    name
    
    // this method can be called on the object constructed from this class 
    doesBark(){
        return "Dog barked!"
    }

    // this defines the "contract"--or what we need--when we construct a new object
    // note the parameters aligning with our member variables
    constructor(age, name){
        this.age = age
        this.name = name
    };
}

// below is how you would "construct a new dog"
// note that you can specify arguments for your parameters in the constructor
let newDog = new Dog(4, "Rover");
console.log(newDog.doesBark())

// function

// functions are blocks of code that are ran
// they can describe an input and return an output
// you get the return value by simply stating return inside the function
// if the return statement is hit, the function will stop

function myFunc(){
    return 3;
}

console.log(myFunc())


// functions are considered objects in javascript
// they can be declared anonymously to a variable as such
// it is called an anonymous function because the function itself does not have a name
// arrow functions can be another name for it in specific instances
// arrow functions will mostly refer to what we call lambdas
// note the arrow => notation
const anonFunc = () => {
    return "this is an anonymous function"
}

console.log(anonFunc())

// tuple 
