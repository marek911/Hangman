import java.util.Scanner;

public class Hangmangame {
    private static String word = Wordbank.wordbank[(int) (Math.random() * Wordbank.wordbank.length)];
    private static String hiddenletter = word.replaceAll("[a-zA-Z]", "*");
    private static int attempt = 0;


    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        while (attempt < 7 && hiddenletter.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(hiddenletter);
            String guess = letter.next();
            if (hang(guess)) {
                System.out.println("Correct! You win! The word was " + word);
                System.out.println("Do you want to play again ?");
                break;
            }
        }
    }

    public static boolean hang(String guess) {
        String newletter = "";
        for (int i = 0; i < word.length(); i++) {
            if (guess.equals(word)){
                return true;
            }else{
            }
            if (word.charAt(i) == guess.charAt(0)) {
                newletter += guess.charAt(0);
            } else if (hiddenletter.charAt(i) != '*') {
                newletter += word.charAt(i);
            } else {
                newletter += "*";
            }
        }
        if (hiddenletter.equals(newletter)) {
            attempt++;
            hangmanImage();
        } else {
            hiddenletter = newletter;
        }
        if (hiddenletter.equals(word)) {
            return true;
        } else
            return false;

    }

    public static void hangmanImage() {
        if (attempt == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (attempt == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (attempt == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (attempt == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (attempt == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (attempt == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (attempt == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
            System.out.println("Do you want to play again ?");

        }
    }
}
