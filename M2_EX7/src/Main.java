import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = -1;
        double minimumScore;
        double minimum = 0;
        double maximum = 10;
        boolean valid = false;
        System.out.println("\nWe gonna check the condition about a score following the rules:");
        try {
            System.out.println("\nPlease, tell me what the minimum score between " + minimum + " and " + maximum + " to get approved? (optional, the default score is 7).");
            minimumScore = Double.parseDouble(sc.nextLine());
            System.out.println("\nOkay, the minimum score was set up to " + minimumScore + ".");
        } catch (NumberFormatException e) {
            minimumScore = 7;
            System.out.println("\nNo problem, since that was not provided a valid number the minimum score was set up to " + minimumScore + ".");
        }
        System.out.println("\nNow that we have the minimum score, go ahead and type the desirable score between " + minimum + " and " + maximum + " to check it up:");
        while (!valid) {
            try {
                score = Double.parseDouble(sc.nextLine());
                if (score >= 0 && score <= 10) {
                    valid = true;
                } else {
                    System.out.println("\nMaybe we hava a kind of mistake here, it expected a score between " + minimum + " and " + maximum + " but " + score + "wasn't provided any in this range. Let's try again, alright?");
                }

            } catch (NumberFormatException e) {
                System.out.println("\nSorry, this is not a valid score between " + minimum + " and " + maximum + ". Please, try again.\n");
            }
        }
        if (score < minimumScore) {
            System.out.println("\nChecking is done. This score is considered: \"Poor\". Wish you luck to the next time!");
        } else if (score >= minimumScore && score < (((maximum - minimumScore) * 0.25) + minimumScore)) {
            System.out.println("\nChecking is done. This score is considered: \"Fair\". Congratulations!");
        } else if (score >= (((maximum - minimumScore) * 0.25) + minimumScore) && score < (((maximum - minimumScore) * 0.5) + minimumScore)) {
            System.out.println("\nChecking is done. This score is considered: \"Good\". You rock! Carry on.");
        } else if (score >= (((maximum - minimumScore) * 0.5) + minimumScore) && score < (((maximum - minimumScore) * 0.75) + minimumScore)) {
            System.out.println("\nChecking is done. This score is considered: \"Very good\". Hands down, you are terrific!");
        } else {
            System.out.println("\nChecking is done. This score is considered: \"Excellent\". Just no words to say how splendid you are!");
        }
    }
}