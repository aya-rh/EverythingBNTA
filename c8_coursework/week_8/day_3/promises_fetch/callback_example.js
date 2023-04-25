const sayHello = (uname, callback) => {
    console.log(`Hello there, ${uname}`);
    setTimeout(() => {callback(uname)}, 2000);
    // the 2000 is ms so you want this callback to be calledback after 2 seconds 
    // so after the first log is called there will be a 2 second delay before the next one is called
    
    // last line has to be wrapped in an anonymous function otherwise it doesn't work - callback argument must be of type function
}

sayHello("John Doe", (uname) => {
    console.log(`Goodbye, ${uname}`);
});
// to call the name, the arrow function needs to be passed into the function to the be called in the log

for(let i = 0; i < 100; i++) {
    console.log("Super important operation number " + i);
}