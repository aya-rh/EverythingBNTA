// [] the only thing that declares an Array 

emptyArray = [];
numbers = [1,2,3,4,5];
letters = ["a", "b", "c", "d", "e"];

badIdea = [0, "a", false, letters, Math.PI];
// just bc you can, doesn't mean you should 




// ------------ Array functions ---------------
shoppingList = ["milk", "eggs", "bread"];

// add new elements to end of array
shoppingList.push("apples");

// remove elements from end of array - no arguments passed in
// takes elements and stores into a variable - can print if wanted to
shoppingList.pop();

// add to start of array 
shoppingList.unshift("coffee");

// remove from start of array - no arguments passed in
// takes elements and stores into a variable - can print if wanted to
shoppingList.shift();

console.log(shoppingList[2]);
// can pass index into log to print out that specific element
// out of bound index e.g. 10 will return undefined - still executes though

// mdn.array website - will show you everything that you can do with an array
