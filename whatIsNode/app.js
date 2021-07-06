var express = require('express');
var app = express();
app.set('view engine','jade');//제이드 템플릿 엔진을 사용하겠다
app.set('views','./jadeviews');//이걸 설정안하면 위에 제이드 템플릿 엔진 set이 자동으로 views라는 폴더를 추적한다.
app.get('/templete',(req,res)=>{//templete를 치고 들어오는 유저에게 이 함수가 실행되며 temp라는 파일ㅇ르 보여줄것이다.
    res.render('temp',{time:Date()});
})

app.locals.pretty =true;
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

