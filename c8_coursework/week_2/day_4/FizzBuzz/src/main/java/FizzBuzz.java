public class FizzBuzz {

    public FizzBuzz(){
    }

    public String checkFizzBuzz(int input){
        // check if input is divisible by 5
        // if so return Buzz
        // else return Fizz
        // FizzBuzz returns needs to go first because it should be the first thing the computer checks
        // modulo checks for remainders (String / checkFizzBuzz) = (input % 5)

        if (input % 5 == 0 && input % 3 == 0) {
            return "FizzBuzz";
        } else if (input % 3 == 0) {
            return "Fizz";
        } else if (input % 5 == 0){
            return "Buzz";
        } else {
            return Integer.toString(input);
        }

    }

}
