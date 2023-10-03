// chapter of arrays 
/*let marks_class_12=[98,88,69,50,"null","not present",100,35,"absent",88,99,45,66];
console.log(marks_class_12);
console.log(marks_class_12[0]);
console.log(marks_class_12[6]);
console.log(marks_class_12.length);
for(let i=0;i<(marks_class_12.length);i++){
  console.log(marks_class_12[i]);
}
let compare=(a,b)=>{
  return b-a;
}
let num1=[111,0.000002,314,49,155,666,777];
/*let num2=[11,12,13,14,155,16,17];
let a=num.join("_");
let a=num.pop();  returns popped element
let a=num.push(9);  returns new array length after pushing
let a=num.unshift();
delete num[0];
let newArray=num1.concat(num2);
console.log(newArray);
num1.sort(compare);
console.log(num1);
*/
//map method
let num=[45,11,99,9,43];
let a = num.map((value,index,num)=>{
  console.log(value,index,num);
    return value*value;
})
console.log(a);
//filter method
let arr=[81,64,49,36,25,16,9,4,1,0];
let b = arr.filter((value)=>{
  return value<=25;
})
console.log(b);
// reduce method
let array=[1,2,3,4,5,6];
let c=array.reduce((h1,h2)=>{
  return h1+h2;
})
console.log(c);