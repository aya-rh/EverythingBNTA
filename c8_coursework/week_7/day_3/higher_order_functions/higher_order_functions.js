const sum = (number1, number2) => {
    console.log(number1 + number2);
}

const subtract = (number1, number2) => {
    console.log(number1 - number2);
}

const multiply = (number1, number2) => {
    console.log(number1 * number2);
}


/**
 * 
 * @param {number} number1 
 * @param {number} number2 
 * @param {string} callback
 */
const doCalculation = (number1, number2, callback) => { // /** above the higher order function shows you the jdoc to pass the data type */
    // if (operation === 'sum'){
    //     return sum(number1, number2);
    // }
    // else if (operation === 'subtract'){
    //     return subtract(number1, number2);
    // }
    // // not needed if the passed in value is callback instead of operation
    // // means we can add another function (mulitply) without having to change anything in the higher order function

    callback(number1, number2);
} 

doCalculation(3, 5, 'sum');
// doCalculation(3, 5, 'multiply');

// anonymous callback function:
console.log(doCalculation(5, 5, (number1, number2) => a / b));



// Built in higher-order functions for arrays
// forEach, map, reduce, filter, sort

const names = ["jack", "jane", "tom", "kate", "tim"];

// 'imperative' approach to enumeration: 
for (let i = 0; i < names.length; i++){
    names[i] = names[i] + '_' + i;
}
console.log(names);

// OR a condensed 'functional' approach: - decoupling enumeration from the operation
names.forEach((fname, i) => names[i] = fname + "_" + i);
console.log(names);