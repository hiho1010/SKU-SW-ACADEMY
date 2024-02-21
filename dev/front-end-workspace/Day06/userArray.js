const users = [];

const user1 = {
    id : 1,
    name : 'kim',
    region : 'seoul'
}
const user2 = {
    id : 2,
    name : 'lim',
    region : 'pusan'
}



// create
users.push(user1);
users.push(user2);

// console.log(users.length);
// console.log(users);

for (let i = 0; i < users.length; i++){
    console.log(users[i]);
}