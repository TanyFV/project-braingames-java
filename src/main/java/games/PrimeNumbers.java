package games;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String... __) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Answer \"yes\" if given number is prime. Otherwise answer \"no\".");
        System.out.println("May I have your name?");

        Scanner in = new Scanner(System.in);
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");

        final int CORRECT_COUNT = 3;

        int count = 1;
        while (count <= CORRECT_COUNT) {
            int number = (int) (Math.random() * (20 - 1)) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = in.next();

            String correctAnswer = (isPrime(number)) ? "yes" : "no";

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(
                        "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + ".");
                in.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName);
        in.close();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
