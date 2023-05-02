// Create a new string called "myNewString" that holds the value of "Developer", using the value from "myString"
const myString = 'developer';
var newString = myString;
var capitalizedLetter = newString.charAt(0);
var lastLetters = myString;
console.log(myString);

// newString2 = newString.toUpperCase(charAt(0));
// console.log(newString2);

capitalizedLetter = capitalizedLetter.toUpperCase();
console.log(capitalizedLetter);
lastLetters = lastLetters.substring(1,9);
console.log(lastLetters);

myNewString = capitalizedLetter + lastLetters;
console.log("New string is: " + myNewString);

//console.log(newString);
