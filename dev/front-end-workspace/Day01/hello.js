let item = {
    name : 'banana',
    price : 1200
}

console.log(item.name);
console.log(item.price);

// for loop of js object = 물론 실제로 사용할 일은 거의 없다.
for (let key in item) {
    console.log(`${key}: ${item[key]}`);
}