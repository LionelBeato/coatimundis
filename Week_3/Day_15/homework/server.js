//declarations and imports 
const express = require('express')
const app = express()
const port = 3000
const mongoose = require('mongoose')
const uri = "mongodb+srv://Admin:mypassword@cluster0-uu8vk.mongodb.net/test?retryWrites=true&w=majority"


//express boilerplate 
app.get('/',(req, res) => res.send("Hello World!"))
app.listen(port, () => console.log(`Listening on port ${port}`))

//mongoose code
mongoose.connect(uri, {useNewUrlParser: true, useUnifiedTopology:true})


//declaring a Dog model with two instances, this creates a collection of dog
const Dog = mongoose.model("Dog", {name:String})
const rover = new Dog ({name:'Rover'})
const newDog = new Dog ({name:'Rex'})


rover.save().then(() => console.log('dog was saved'))
newDog.save().then(() => console.log('dog was saved'))

Dog.find().then(res => console.log(res))