let apple = {
    name: 'apple',
    color: ['red', 'green', 'yellow'],
    amount: 3,
    tasty: function(){
        console.log('this is tasty')
    },
    worms: {
        name:'jim',
        length:'1 inch'
    }
}

apple.worms.name = 'tim'

// json syntax in javascript is completely legal
// notice the quotations! 
let json = {
    "firstprop":true,
    "secondprop":2,
    "thirdprop":"yellow"
}

console.log(json)

console.log(apple.worms)