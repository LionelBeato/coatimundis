let list = ['apples', 'milk', 'bread', 'cereal']

list.push('pears')
list[1] = 'oat milk'

let cart = []

// map will always return an array
cart = list.map(element => element)
console.log(cart)
list = []

// let i = list.length - 1


// while(list.length >= 1){
//     let el = list[i]

//     //pop items from our grocery list
//     list.pop()
//     //push items to cart
//     cart[i] = el
//     i--
// }



// console.log(list)
// console.log(cart)