// these are different ways to target nodes on a document

let myEl = document.getElementById("myel")
myEl.innerHTML = "this text is rendered in javascript!"
myEl.style.color = "blue"
let myTag = document.getElementsByTagName("h1")
let myClass = document.getElementsByClassName("myClass")
let query = document.querySelector('#header')


// Objects that I will be storing in memory

let user = {
    name:"Shane"
}

let doggie = {
    name:"Rover"
}

// Stringifying those objects

let storeUser = JSON.stringify(user)

let storeDog = JSON.stringify(doggie)

// Setting those objects in memory with a Key Value Pair

localStorage.setItem('userInfo', storeUser)
localStorage.setItem('my dog',storeDog)


// 

console.log(localStorage.getItem('userInfo'))

const handleScroll = () => {
    window.scroll(0,0)
}

const handleStorage = () => {
    console.log(localStorage.getItem('my dog'))
}
