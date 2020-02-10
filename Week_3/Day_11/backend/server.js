// const http = require('http');
// const PORT = 8080

// const server = http.createServer((req, res) => {
//     res.writeHead(200, { 'Content-Type': 'text/html' }); 
//     res.end('Hello!')
// })

// server.listen(PORT, () => console.log(`Server is listening on port ${PORT}`))


const express = require('express')
const app = express()
const port = 3000

let apples = {name:'apples', amount:4}

// app.use(function(req, res, next) {
//     res.header("Access-Control-Allow-Origin", "http://localhost:300"); // update to match the domain you will make the request from
//     res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
//     next();
//   });


app.get('/', (req, res) => res.send('hello there!'))
app.get('/index', (req, res) => res.sendFile('index.html', {root:__dirname}))
app.get('/data', (req, res) => res.json(apples))
app.use(express.static('./'))
app.listen(port, () => console.log(`Example port on port ${port}`))