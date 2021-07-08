const express = require('express');
const app = express();
const users = require('./api.json');

const server = app.listen(3001, () =>{
    console.log(`Start Server : localhost:3001`)
});

//1. 나이 30 이상, 회사이름 카테노이드 추출
//2. 이름 뒤집기
app.get('/api',(req, res)=>{
    console.log(users)
    
    try{
        res.send(users)
    }catch(err){
        res.send("err발생" + err)
    }
})