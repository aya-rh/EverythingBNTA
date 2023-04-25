alice = {
    name: "Alice", 
    age: 25,
    favouriteColour: "blue"
}

bob = {
    age: 28,
    favouriteColour: "yellow",
    name: "Bob"
}

// any JSON we write is valid JS but not always the other way around 
// difference is that JS needs variables to be declared and can't declare variable twice - age twice will 
// just be overwritten 

console.log(alice["favouriteColour"]); // can do this but less effective
console.log(alice.favouriteColour);
console.log(bob);

// can assign something else this way
// can reassign
alice.location = "London";
alice.location = "Manchester"

alice.petName = "Poppy";

console.log(alice);