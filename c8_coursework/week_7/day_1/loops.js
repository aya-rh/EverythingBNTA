shoppingList = ["milk", "eggs", "bread", "apples", "coffee", "biscuits"];

// same as a java for but don't have to declare and define index/i
for (index = 0; index < shoppingList.length; index++){
    console.log(shoppingList[index]);
}

//JS equivalent of String item : shoppingList
for (item of shoppingList){
    console.log(item.toUpperCase());
}

// for of - array - very common
// for in - object - not that common to loop over objects so used less

alice = {
    name: "Alice", 
    age: 25,
    favouriteColour: "blue"
}

for (key in alice) {
    console.log(alice[key]);
}


