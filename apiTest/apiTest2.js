const express = require('express');
const app = express.Router();
const users = app.get('api.Json');

//1. 쿼리스트링으로 아이디 받아서 같으면 출력하기

app.get('/api',(req, res, next)=>{
    
})