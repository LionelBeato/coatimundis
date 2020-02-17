
// declarations and imports
const express = require('express')
const app = express()
const port = 3000
const assert = require('assert')
const mongoose = require('mongoose')

const dbName = 'myproject'
const mongo = require('mongodb').MongoClient
const uri = "mongodb+srv://Admin:mypassword@cluster0-uu8vk.mongodb.net/test?retryWrites=true&w=majority";

// express boilerplate
app.get('/', (req, res) => res.send('Hello World!'))
app.listen(port, () => console.log(`Example app listening on port ${port}!`))

mongoose.connect(uri, {useNewUrlParser: true, useUnifiedTopology: true})

const Cat = mongoose.model('Cat', {name:String})

const garfield = new Cat ({name:'garfield'})

garfield.save().then(() => console.log('lasagna cat was saved'))

console.log(Cat.find())

