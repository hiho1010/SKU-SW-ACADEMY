// function test(callback){
//     let data = 10;
//     setTimeout(() => {
//         data = 100;
//         callback(data);
//     }, 3000);
//     // console.log(data);
// }
//
// let cb2 = function (data) {
//     console.log(data)
// }
//
// test(cb2);
//
function type3() {
    return new Promise(function (resolve, reject) {
        let data = 10;
        setTimeout(()=>{
            data = 100;
            resolve(data);
        }, 3000);
    });
}
//
// type3().then(function (result){
//     console.log(result);
// });

// 사용하려면 type3가 프로미스여야한다.
// 이를 async await 모델이라고 한다.
async function type4() {
    let result = await type3();
    console.log(result);
}

type4();