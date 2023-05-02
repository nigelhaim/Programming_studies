var y = Math.floor(Math.random()*50+1);
var x = Math.floor(Math.random()*100+1);
console.log(x);
console.log(y);

var sum = x + y;
var difference = x - y;
var product = x * y;
var quotient = x / y;
var rm = x % y;

var sumOutput = `${x} + ${y} = ${sum}`;
var differenceOutput = `${x} - ${y} = ${difference}`;
var productOutput = `${x} * ${y} = ${product}`;
var quotientOutput = `${x} / ${y} = ${quotient}`;
var rmOutput = `${x} % ${y} = ${rm}`;


console.log(sumOutput);
console.log(differenceOutput); 
console.log(productOutput); 
console.log(quotientOutput); 
console.log(rmOutput); 
