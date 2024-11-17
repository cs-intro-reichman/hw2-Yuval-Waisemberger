// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String inputWord = args[0].toUpperCase();
                int number = Integer.parseInt(args[1]);
                String lettersForAnOrA = "AEFHILMNOR";

                for (int i = 0; i < inputWord.length(); i++) {
                        char letter = inputWord.charAt(i);
                        // Program checks whether the letter in position number {i}
                        // is one of the letters "AEFHILMNOR" 
                        if (lettersForAnOrA.indexOf(letter) == -1) {
                                System.out.println("Give me a  " + letter + ": " + letter + "!");
                        } else {
                                System.out.println("Give me an " + letter + ": " + letter + "!");
                        }
                }
                System.out.println("What does that spell?");
                for (int count = 0; count < number; count++) {
                        System.out.println(inputWord + "!!!");
                }
        }
}
