counter = 0;

while (counter < 10){
    console.log(counter);
    counter++; // without this increment declaration it will loop 0 and will be stuck in overflow
    if (counter === 5){
        break; // can be used in for loops too
    }
}