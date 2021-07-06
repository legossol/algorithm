var express = require('express');
var app = express();
app.use(express.static('image'));
app.get('/',(req,res)=>{
    res.send("어 왔니?");
});
app.get('/login',(req,res)=>{
    res.send("로그인하러왔니?")
})
app.listen(3000,()=>{
    console.log('Connected 3000 port');
});
app.get('/dynamic', (req,res)=>{
    var time =Date();
    var output =`<!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body>
        <p>static dynamic page</p>
        ${time}
    </body>
    </html>`
    res.send(output)
})