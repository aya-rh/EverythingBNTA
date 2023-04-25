// ------- GLOBAL SCOPE -------

numbers = [1, 2, 3, 4, 5];

for (let number of numbers) {
    console.log("value of number inside loop: ", number);
}
// this works but we haven't 'cleaned' up after ourselves
// we don't want 'number' to exist outside of the loop - if logged outside the loop it still recognises 'number'
// gives you last line for the last number again - "pollutes the scope"
// solve problem by introducing 'let' in front of number - make it block scoped to that for loop
// now won't work if logged outside the loop 



// ------- LEXICAL SCOPE -------

// can be referred to and used outside of the loop
numbers = [1, 2, 3, 4, 5];

let numberToPrint = 0;

for (let number of numbers) {
    numberToPrint = number; 
    console.log("value of numberToPrint inside loop: ", numberToPrint);
}

console.log("value of numberToPrint outside loop: ", numberToPrint);
// let indiccates that its the first time being created/used 


// if we use const - we have to declare a value 


// ---------- CONST 
numbers = [1, 2, 3, 4, 5];

const numbersSquared = [];

for (const number of numbers){
    numbersSquared.push(number ** 2);
}

console.log(numbersSquared);


// ---------- FUNCTION SCOPE ---------
const myFunction = () => {
    if (true) {
        var aVarVariable = "will print as it has FUNCTION scope";
        let aLetVariable = "will not print as it has BLOCK scope";
    }
    console.log(aVarVariable);
    console.log(aLetVariable); // won't print bc let is blocked to the block above, since were printing it outside and 
    // even if its within a nested block it still won't print - if ln 51 was declared before the if statement it would work
}

myFunction();