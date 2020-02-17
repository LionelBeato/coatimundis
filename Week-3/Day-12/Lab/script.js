// what is a data structure? 

let fruits = ['apple', 'pear', 'banana']


// this will add to the tail of the array 
// fruits.push('jackfruit')
// this will remove the tail of the array
// fruits.pop()

// this will remove the head of the array
// fruits.shift()
// this will add to the head of the array
// fruits.unshift('jackfruit')


// fruits[3] = 'grape'
fruits[3] = 'orange'

// returns the slice of an array between the elements that you specify
// console.log(fruits.slice(1,3))

// adds element between the two values you specify
// fruits.splice(1,3,'jackfruit')

// for (let i = 0; i < fruits.length; i++){
//     console.log(fruits[i])
// }

// forEach does not return an array
// fruits.forEach(element => console.log(`I love to eat ${element}`))

// console.log(fruits)

// map does return an array
// const newFruits = fruits.map(element => element+" is really good")

// console.log(newFruits)

// methods to allow you to stringify an array 
let shapes = ['square', 'triangle']
let a = shapes.toString()
let b = shapes.join(' & ')

console.log(b)

// methods to sort and reverse an array 
let numbers = [2,1,3]
console.log(numbers.sort())
console.log(numbers.reverse())