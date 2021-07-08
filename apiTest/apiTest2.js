const express = require('express');
const app = express();
const users = require('./api.json');

const server = app.listen(3002, () =>{
    console.log(`Start Server : localhost:3001`)
});
//1. 쿼리스트링으로 아이디 받np아서 같으면 출력하기

app.get('/api',(req, res, next)=>{
    console.log(users);
    const userId = req.params.id;
    const result ={};
    try{

    }catch(err){
        res.send("err발생" + err)
    }
})