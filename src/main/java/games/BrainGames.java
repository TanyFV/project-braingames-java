package games;

import java.util.Scanner;

public class BrainGames {

    public static void main(String... __) {
        Scanner in = new Scanner(System.in);
        String userName = Utils.welcomeToBrainGames("Answer \"yes\" if number even otherwise answer \"no\".");
        Utils.isCorrectNumber(userName, (val) -> val % 2 == 0);
        in.close();
    }

}
