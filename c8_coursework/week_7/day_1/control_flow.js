// guessing game - no user input 
// == loose equality - bad 
// === strict equality - checks for both value and type - good 

secretNumber = 99;
userGuess = 99;

if (userGuess === secretNumber){
    console.log("Congratulations! You win!");
} else if (userGuess > secretNumber){
    console.log("Unlucky, your guess was too high!");
} else {
    console.log("Unlucky! You guessed wrong!");
}