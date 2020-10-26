package games;

import java.util.Scanner;

public class Engine {
    public static void Play(String descriptionGame, String[] data) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println(descriptionGame);
        System.out.println("May I have your name?");

        Scanner in = new Scanner(System.in);
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");

        final int ROUND_COUNT = 3;

        int count = 1;
        /*
         * while (count <= ROUND_COUNT) { int number = (int) (Math.random() * (20 - 1))
         * + 1; System.out.println("Question: " + number); String correctAnswer =
         * (predicate.test(number)) ? "yes" : "no";
         * 
         * System.out.print("Your answer: "); String userAnswer = in.next();
         * 
         * if (userAnswer.equals(correctAnswer)) { System.out.println("Correct!");
         * count++; } else { String wrongAnswer =
         * String.format("'%s' is wrong answer ;(. Correct answer was '%s'.",
         * userAnswer, correctAnswer); System.out.println(wrongAnswer);
         * System.out.println("Let's try again, " + userName + ".");
         * 
         * return; } }
         */
        // [[question, answer],[question, answer],[question, answer]]

        // generate() -> [question, answer]

        in.close();
        System.out.println("Congratulations, " + userName);
    }

}
