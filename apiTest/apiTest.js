const express = require('express');
const app = express();
const users = require('./api.json');

const server = app.listen(3001, () =>{
    console.log(`Start Server : localhost:3001`)
});

//1. 나이 30 이상, 회사이름 카테노이드 추출
//2. 이름 뒤집기
app.get('/api',(req, res)=>{
    let result = {};
    console.log("작동되고 있니?")
    try{
        for(let i =0;i<users.length;i++){
            if(users[i].age > 30 && users[i].company == "할리스"){
                console.log(users[i])
                // result.push(users[i]);
                result = users[i];
                console.log("result===",result);
                
            }
        }
        res.send(result);
    }catch(err){
        res.send("err발생" + err)
    }
})