let array = [{
    name: 'banana',
    price: 1200
}, {
    name: 'apple',
    price: 2000
}, {
    name: 'pear',
    price: 2500
    }];

let popped = array.pop();
console.log(popped);
console.log(array);

array.push(popped);
array.push({
    name: 'pineapple',
    price: 3000
})

array.sort();
console.log(array.reverse());

array.forEach((item, index) => {
    console.log(`${index} --- ${item}`)
})
let fArray = [32, 5, 234,54 ,435 ,43 ,26, 63, 34];
let filtering = fArray.filter((item, index) => {
    return item % 2 ==  0;
})
console.log(filtering)