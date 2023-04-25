import java.util.HashSet;
public class Tester {

    // Question 1
    public static boolean isIsogram(String str) {
        HashSet<Character> checkedLetters = new HashSet<>();
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        for (char l : arr){
            if (checkedLetters.contains(l)){
                return false;
            } else {
                checkedLetters.add(l);
            }

        }
        return true;
    }

        // Question 2

//    public static void main(String[] args) {
//        String inputtedString = "aya hezam";
//        String newString = "";
//
//        inputtedString = " " + inputtedString;
//
//        for (int i=0; i<inputtedString.length();){
//            char l = inputtedString.charAt(i);
//            if (l == ' '){
//                newString = newString + ' ' + Character.toUpperCase(inputtedString.charAt(i+1));
//                i = i + 2;
//            } else {
//                newString = newString + l;
//                i++;
//            }
//        }
//        System.out.println(newString.trim());
//    }
    // didnt work


//    public static String capitalizeWords(String s) {
//        String inputtedString = new inputtedString;
//        String capitalizedString = "";
//
//        inputtedString = " " + inputtedString;
//
//        for (int i = 0; i < inputtedString.length();){
//            char l = inputtedString.charAt(i);
//
//            if (l == ' '){
//                capitalizedString = capitalizedString + ' ' + Character.toUpperCase(inputtedString.charAt(i+1));
//                i = i + 2;
//            } else {
//                capitalizedString = capitalizedString + l;
//                i++;
//            }
//        }
//        return capitalizedString;
//    }
    // also didnt work


    public static String capitalizeWords(String s) {
        boolean previousIsBlankSpace = true;
        char[] characters = s.toCharArray();

        if (s.isEmpty()){
            return s;
        }

        for (int i = 0; i < characters.length; i++){
            if (Character.isLetter(characters[i])){
                if (previousIsBlankSpace){
                    characters[i] = Character.toUpperCase(characters[i]);
                }
                previousIsBlankSpace = false;
            } else {
                previousIsBlankSpace = Character.isWhitespace(characters[i]);
            }
        }
        return new String(characters);
    }

}
