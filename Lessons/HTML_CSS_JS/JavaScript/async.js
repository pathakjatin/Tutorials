console.log("1");
function helloJS(){               
    console.log("Timeout function executed"); 
}
setTimeout(helloJS,2000); // measure in milliseconds ; hello is executed after 2 seconds ; working asynchronous
console.log("2");
//-------------------------------------------------------------------------------------------------------//
// callback
function sum(a,b){
    console.log(a+b);
}
function cal(a,b,sumCallback){
    sumCallback(a,b);
}
cal(2,3,sum);
//-------------------------------------------------------------------------------------------------------//
//callback hell
// function getData(dataId, getNextData){
//     setTimeout(()=>{
//         console.log("data", dataId);
//             if(getNextData){
//                 getNextData();
//             }
//     },2000);
// };
// getData(1,()=>{
//     console.log("getting data 2....");
//         getData(2,()=>{
//             console.log("getting data 3....");
//                 getData(3,()=>{
//                     console.log("getting data 3....");
//                         getData(4);
//                 });
//         });
// });
//-------------------------------------------------------------------------------------------------------//
//promise chain
function getData(dataId){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("data", dataId);
            resolve("success");
        },2000);
    })
};
//actual promise chain
getData(1).then((res)=>{
    return getData(2);
}).then((res)=>{
    return getData(3);
}).then((res)=>{
    console.log(res);
})
//-------------------------------------------------------------------------------------------------------//
// async await
function api(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("weather data");
            resolve(200);
        } ,2000);
    });
};
async function weatherData(){
    await api(); //1st
    await api(); //2nd
}
async function getAllData(){
    console.log("getting data 1....");
    await getData(1);
    console.log("getting data 2....");
    await getData(2);
    console.log("getting data 3....");
    await getData(3);
    console.log("getting data 4....");
    await getData(4);
}