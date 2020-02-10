// everything outside of other blocks define the global scope
// so x is defined globally

// let x = 3


// // this function is a block scope 
// function highFunc() {

//     console.log(x)

//     function myFunc() {
//         let x = 2
//         console.log(x)
//     }
// }

// console.log(x)

(function(){

})



// this variable gets hoisted into myFunc()
// x = 4


// this is how you would declare an object 
let car = {
    type:"Fiat",
    model:"500",
    color:"white"
}

let myArr = [
    4, 3, 5, 2
]

// this code will mutate myArr, something you don't want to do
// immutability is a key part of functional programming
// for(let i = 0; i < 4; i++){
//     //mutate myArr
//     x = myArr[i] += 2
//     myArr[i] = x 
//     console.log(myArr[i])
// }
// console.log(myArr)

// map higher order function that allows use to avoid mutability
// a new array is declared as the result of our higher order function
newArr = myArr.map(x => x+2)

console.log(newArr)