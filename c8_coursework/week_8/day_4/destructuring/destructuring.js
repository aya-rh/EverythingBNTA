const numbers = [1, 2, 3, 4, 5];
console.log(numbers [0]);
// accessing arrays through [0] every time is tedious 
// there is a method to declare it at the start only and thats it

const [first, second, ...rest] = numbers;
// this essentially is a mapping 
// mapping one array to another to represent the numbers - each variable is assigned to its corresponding one 

console.log(first);
console.log(second);
console.log(rest);

// seen occasionally probably not used as often as thought 
// used with objects most commonly 

const person = {
    name: "Aya",
    location: "Brighton",
    favouriteFood: "Cheese"
}
console.log(person);

const {name, location, favouriteFood} = person;

console.log(name);
console.log(location);
console.log(favouriteFood);
// as long as keys are there the ordering doesn't matter 
// objet destructuring is most common 


