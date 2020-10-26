package games;

import static io.hexlet.pairs.Pair.car;
import static io.hexlet.pairs.Pair.cdr;
import static io.hexlet.pairs.Pair.cons;
import static io.hexlet.pairs.Pair.isPair;

import io.hexlet.pairs.Pair;

public class PrimeNumbers {

    String gameDescription;
    int number;

    PrimeNumbers() {
        gameDescription = "Простое число";
        number = (int) (Math.random() * (20 - 1)) * +1;
    }

    boolean isPrime() {
        if (number < 2)
            return false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public Pair generateGameData() {
        String question = String.format("Question: %s", number);
        String correctAnswer = (isPrime()) ? "yes" : "no";
        return cons(question, correctAnswer);
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public static void main(String... __) {
        // Scanner in = new Scanner(System.in);
        // String userName = Utils
        // .welcomeToBrainGames("Answer \"yes\" if given number is prime. Otherwise
        // answer \"no\".");
        // Utils.isCorrectNumber(userName, (val) -> {
        // if (val < 2)
        // return false;
        // for (int i = 2; i < val / 2; i++) {
        // if (val % i == 0)
        // return false;
        // }
        // return true;
        // });
        // in.close();
    }
}
