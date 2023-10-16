import java.util.Scanner;
public class PangramChecker {
    public static boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSentence = scanner.next(); // Example sentence
        boolean isPangram = isPangram(inputSentence.toLowerCase());
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
