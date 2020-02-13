// these are different ways to target nodes on a document

let myEl = document.getElementById("myel")
myEl.innerHTML = "this text is rendered in javascript!"
myEl.style.color = "blue"
let myTag = document.getElementsByTagName("h1")
let myClass = document.getElementsByClassName("myClass")
let query = document.querySelector('#header')

// you can explicit set a node's attributes as well!

let elt = document.getElementById("otherel")
elt.setAttribute("style","color:orange; border: 1px solid")

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




console.log(localStorage.getItem('userInfo'))


// method to handle resetting the scroll position

const handleScroll = () => {
    window.scroll(0,0)
}

// method to handle logging storage data for the dog object
const handleStorage = () => {
    console.log(localStorage.getItem('my dog'))
}

// HTML methods for DOM traversing

let items =  document.querySelector('ul').children

// function to check how many items are in my list

const handleList = () => {
    console.log(items.length) 
}

const handleRemove = () => {
    document.querySelector('.remove').remove()
}


elt.addEventListener('click', (event) => console.log("clicked"))
window.addEventListener('keypress', (event) => console.log('key pressed '))
// event listeners 