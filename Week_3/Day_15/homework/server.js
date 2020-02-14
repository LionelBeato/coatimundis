//declarations and imports 
const express = require('express')
const app = express()
const port = 3000
const mongoose = require('mongoose')


//express boilerplate 
app.get('/',(req, res) => res.send("Hello World!"))
app.listen(port, () => console.log(`Listening on port ${port}`))