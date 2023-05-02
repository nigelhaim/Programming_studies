//Example of concatination
let x;

const name = 'john';
const age = 31;

//x = "hello my name is " + name + '. I am ' + age + ' years old.'

x = `Hello my name is ${name}. I am ${age} years old.`
console.log(x);
console.log(x.length);//Length of the string 

//x = new String('John');//Instantiated as a class
//x = x.__proto__;
x = x.toUpperCase();//Can also be used on lowercase just use .toLowerCase();

x = x.indexOf('n');//Find the index of the character


//Gets the substring of a string 
x = new String("Hello world");
x = x.substring(1,4);
console.log(x);


//The slice 
x = new String("Hello world");
x = x.slice(-11,-6);
console.log(x);

//Remove spaces
x = new String("Hello world");
console.log(x.trim());

//Replace some characters of a string
x = new String("Hello world");
console.log(x.replace('world', 'John'));



//includes

//x = x.includes('Hell1');

//splits and put the words on an array based on a specific character
x = x.split(' ');
console.log(x);
//console.log(x[0]);//The character of the string 

