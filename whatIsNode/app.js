var express = require('express');
var app = express();
app.get('/',(req,res)=>{
    res.send("어 왔니?");
});
app.get('/login',(req,res)=>{
    res.send("로그인하러왔니?")
})
app.listen(3000,()=>{
    console.log('Connected 3000 port');
});