const express = require('express');
const app = express();
const users = require('./api.json');

const server = app.listen(3001, () =>{
    console.log(`Start Server : localhost:3001`)
});
//1. 쿼리스트링으로 아이디 받np아서 같으면 출력하기

app.get('/api/:id',(req, res)=>{
    const userId = req.params.id;
    let result ={};
    try{
        for(let i=0;i<users.length;i++){
            if(userId == users[i].id){
                result = users[i];
                console.log(result);
                res.send(result);
            }
        }
    }catch(err){
        res.send("err발생" + err)
    }
})