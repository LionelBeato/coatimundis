// const http = require('http');
// const PORT = 8080

// 3const server = http.createServer((req, res) => {
//     res.writeHead(200, { 'Content-Type': 'text/html' }); 
//     res.end('Hello!')
// })

// server.listen(PORT, () => console.log(`Server is listening on port ${PORT}`))


const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => res.send('hello there!'))
app.get('/index', (req, res) => res.sendFile('index.html', {root:__dirname}))
app.get('/data', (req, res) => res.json({ fruit: 'apple', amount: 4}))
app.listen(port, () => console.log(`Example port on port ${port}`))