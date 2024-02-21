// module
const express = require('express');

// create server/execute
const app = express();
app.listen(3300, () => {
    console.log('Server Running at http://127.0.0.1:3300');
});

// add middleware
app.use(express.urlencoded({
    extended: false
}));

// declare variable
let userCounter = 0;
const users = [];

// routing
// get all users
app.get('/user',(request,response)=>{
    // 요청을 처리하는 로직
    response.send(users);
});

// get
app.get('/user/:id',(request,response)=>{
    // id 추출 후, 해당 id의 유저를 검색한다.
    const id = request.params.id;
    const filtered = users.filter((user) => user.id == id);

    if (filtered.length == 1)
        response.send(filtered[0]);
    else
        response.status(404).send('Data is not exists')
});

// post
app.post('/user/:id',(request,response)=>{

});

// put
app.put('/user/:id',(request,response)=>{

});


// delete
app.delete('/user/:id',(request,response)=>{});


















