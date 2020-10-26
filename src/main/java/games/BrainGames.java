package games;

import static io.hexlet.pairs.Pair.car;
import static io.hexlet.pairs.Pair.cdr;
import static io.hexlet.pairs.Pair.cons;
import static io.hexlet.pairs.Pair.isPair;

import io.hexlet.pairs.Pair;

public class BrainGames implements GenerateData {

    String gameDescription;

    BrainGames() {
        gameDescription = "Проверка на четность";

    }

    public Pair generateGameData() {

        int number = (int) (Math.random() * (20 - 1)) * +1;
        String question = String.format("Question: %s", number);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";

        return cons(question, correctAnswer);
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public static void main(String... __) {
        // Scanner in = new Scanner(System.in);
        // String userName = Utils.welcomeToBrainGames("Answer \"yes\" if number even
        // otherwise answer \"no\".");
        // Utils.isCorrectNumber(userName, (val) -> val % 2 == 0);
        // in.close();
    }

}
