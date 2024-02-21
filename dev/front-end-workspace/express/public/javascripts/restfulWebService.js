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
    const body = request.body;
    // Exception handling
    if (!body.name)
        return response.status(400).send('Input your name');
    else if (!body.region)
        return response.status(400).send('Input your name');

    const name = body.name;
    const region = body.region;

    const data = {
        id : userCounter++,
        name: name,
        region : region
    };
    users.push(data);

    console.log('success');

    response.send(data);
});

// put
app.put('/user/:id',(request,response)=>{
    const id = request.params.id;
    const body = request.body;

    let member = [];

    for( let i = 0; i < users.length;i++){
        if(users[i].id == id){
            users[i].name = body.name;
            users[i].region = body.region;
            member = (users[i]);
            console.log('change');
        }
    }
    response.send(member);
    console.log('success');
});


// delete
app.delete('/user/:id',(request,response)=>{
    const id = request.params.id;
    let index = 0;
    for (let i=0; i <users.length;i++){
        if(users[i].id ==id){
            index = i;
        }
    }
    const member = users.splice(0,1);
    response.send(member);
});