const sum = function (number1, number2) {
    return number1 + number2;
}

// need to include return function

const total = sum(2, 3);
console.log(total);


// const add10 = function (number) {
//     return number + 10;
// }



// ARROW FUNCTION
// anonymous 

const multiply = (number1, number2) => {
    return number1 * number2;
}

const product = multiply(5,7);
console.log(product);



// NAMED FUNCTION
// old school - not used much anymore 
// not anonymous 

function greet(person, timeOfDay){
    console.log("Good " + timeOfDay + " " + person + "!");
}

greet("Colin", "morning");