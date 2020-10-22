package games;

import java.util.Scanner;
import java.lang.Math;
import java.util.function.Predicate;

public class Utils {
    public static String welcomeToBrainGames(String str) {

        System.out.println("Welcome to the Brain Games!");
        System.out.println(str);
        System.out.println("May I have your name?");

        Scanner in = new Scanner(System.in);
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }

    public static void isCorrectNumber(String userName, Predicate<Integer> predicate) {

        final int ROUND_COUNT = 3;
        Scanner in = new Scanner(System.in);
        int count = 1;
        while (count <= ROUND_COUNT) {
            int number = (int) (Math.random() * (20 - 1)) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = in.next();
            String correctAnswer = (predicate.test(number)) ? "yes" : "no";

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(
                        "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + ".");

                return;
            }
        }
        System.out.println("Congratulations, " + userName);
        in.close();

    }

}
