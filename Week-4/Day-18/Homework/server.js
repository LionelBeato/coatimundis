var express = require("express");
let cors = require("cors")
const Duck = require("./model")
var app = express();
var port = 8080;

let daffy = new Duck("Daffy")

app.use(cors())


// our server is more properly described here as our Controller
// although business logic will be in this file, typically that would be abstracted away in a seperate component called a Service
app.get("/", function (req, res) {
    // res.send("hello world");
    res.send(daffy)
});

app.listen(port, function () {
    console.log("server is listening on port " + port);
});
