let isLoading = true;

console.log(isLoading);
let sym = Symbol('a');
console.log(typeof sym);

//Colors 

/*
    You can use typeof 
    Boolean - purple

*/

let person = {
    firstName:'john',
    age:15
}

console.log(person);    
let newArr = [4,5,6];
//let numArr = [...newArr];
let numArr = newArr;

numArr.push(10);
console.log(numArr);
console.log(newArr);