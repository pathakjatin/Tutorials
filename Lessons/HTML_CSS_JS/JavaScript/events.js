let btn1 = document.getElementById("btn1");
// btn1.onclick =(evt)=>{
//     console.log(evt);
//     console.log(evt.type);
//     console.log(evt.target);
//     console.log(evt.clientX , evt.clientY); //for position
// }
btn1.addEventListener("click", (evt)=>{
    console.log("Button 1 was clicked - Handler 1");
})
btn1.addEventListener("click", (evt)=>{
    console.log("Button 1 was clicked - Handler 2");
})
const handler3 = () =>{
    console.log("Button 1 was clicked - Handler 3");
}
btn1.addEventListener("click",handler3)
btn1.addEventListener("click", (evt)=>{
    console.log("Button 1 was clicked - Handler 4");
})
btn1.removeEventListener("click", handler3)
let btn2 = document.getElementById("btn2");
btn2.ondblclick =()=>{
    console.log("Button was clicked twice");
}
let box = document.querySelector('.box');
box.onmouseover = (evt)=>{
    box.style.background="black";
    box.style.color="white";
    console.log("Box is hovered");
    console.log(evt);
    console.log(evt.type);
    console.log(evt.target);
    console.log(evt.clientX , evt.clientY);
}
let mode = document.querySelector('#mode');
let currentMode = "light";
mode.addEventListener("click",()=>{
    if(currentMode === "light"){
        currentMode = "dark";
        document.querySelector("body").classList.add("dark");
        document.querySelector("body").classList.remove("light");
        // body.classList.add("dark");
    }else{
        currentMode = "light";
        document.querySelector("body").classList.add("light");
        document.querySelector("body").classList.remove("dark");
        // body.classList.add("light");
    }
    console.log(currentMode);
})