const {Student} = require("./student"); 
const {Laptop} = require("./laptop")
// call on 'class'

const alice = new Student("Alice");
const bob = new Student("Bob")

// console.log(alice);
// console.log(bob);

// alice.greet(); // need to declare the function here otherwise will just print anonymous function if the prototype isnt declared 
// bob.greet();

const laptop = new Laptop("Apple", "MacBook Air", "Monteray");

// laptop.install("games");
alice.buyLaptop(laptop);
alice.installProgram("Chrome");