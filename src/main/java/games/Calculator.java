package games;

import java.util.Scanner;

import java.util.Random;

public class Calculator {

    public static void main(String... __) {

        String userName = Utils.welcomeToBrainGames("What is the result of the expression?");

        final int ROUND_COUNT = 3;
        Scanner in = new Scanner(System.in);
        int count = 1;
        while (count <= ROUND_COUNT) {
            int firstNumber = (int) (Math.random() * (20 - 1)) + 1;
            int secondNumber = (int) (Math.random() * (20 - 1)) + 1;

            char operation = getOperationSymbol();
            System.out.println("Question: " + firstNumber + "  " + operation + " " + secondNumber);
            System.out.print("Your answer: ");
            int userAnswer = in.nextInt();

            int correctAnswer = calculateExpression(firstNumber, secondNumber, operation);

            if (userAnswer == correctAnswer) {
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

    public static int calculateExpression(int firstNumber, int secondNumber, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculateExpression(firstNumber, secondNumber, operation);
        }
        return result;
    }

    public static char getOperationSymbol() {
        char[] operationSymbol = new char[] { '+', '-', '*' };
        return operationSymbol[(new Random()).nextInt(operationSymbol.length)];
    }
}
