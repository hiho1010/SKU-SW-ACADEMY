const express = require('express');
const {request, response} = require("express");


// make server application object
const app = express();

// request event listener 생성
app.use((request, response)=>{
    response.send('<h1>Hello Express</h1>');
});

// start server
app.listen(3000,()=>{
    console.log('server running at http://localhost:3000');
});