package games;

import java.util.Random;

import static io.hexlet.pairs.Pair.car;
import static io.hexlet.pairs.Pair.cdr;
import static io.hexlet.pairs.Pair.cons;
import static io.hexlet.pairs.Pair.isPair;

import io.hexlet.pairs.Pair;

public class Calculator {

    String gameDescription;
    int firstNumber;
    int secondNumber;
    char operationSymbol;

    Calculator() {
        gameDescription = "Калькулятор";
        firstNumber = (int) (Math.random() * (20 - 1)) + 1;
        secondNumber = (int) (Math.random() * (20 - 1)) + 1;
        operationSymbol = getOperationSymbol();
    }

    char getOperationSymbol() {
        char[] operationSymbol = new char[] { '+', '-', '*' };
        return operationSymbol[(new Random()).nextInt(operationSymbol.length)];
    }

    Integer calculateExpression() {
        Integer result;
        switch (operationSymbol) {
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
                result = calculateExpression();
        }
        return result;
    }

    public Pair generateGameData() {
        String question = String.format("Question: " + firstNumber + " " + operationSymbol + " " + secondNumber);
        String correctAnswer = calculateExpression().toString();
        return cons(question, correctAnswer);
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public static void main(String... __) {

        // String userName = Utils.welcomeToBrainGames("What is the result of the
        // expression?");

        // final int ROUND_COUNT = 3;
        // Scanner in = new Scanner(System.in);
        // int count = 1;
        // while (count <= ROUND_COUNT) {

        // int firstNumber = (int) (Math.random() * (20 - 1)) + 1;
        // int secondNumber = (int) (Math.random() * (20 - 1)) + 1;
        // char operation = getOperationSymbol();
        // System.out.println("Question: " + firstNumber + " " + operation + " " +
        // secondNumber);
        // int correctAnswer = calculateExpression(firstNumber, secondNumber,
        // operation);

        // System.out.print("Your answer: ");
        // int userAnswer = in.nextInt();

        // if (userAnswer == correctAnswer) {
        // System.out.println("Correct!");
        // count++;
        // } else {
        // String wrongAnswer = String.format("'%s' is wrong answer ;(. Correct answer
        // was '%s'.", userAnswer,
        // correctAnswer);
        // System.out.println(wrongAnswer);
        // System.out.printf("Let's try again, %s.", userName);

        // return;
        // }
        // }

        // System.out.println("Congratulations, " + userName);
        // in.close();

    }

}
