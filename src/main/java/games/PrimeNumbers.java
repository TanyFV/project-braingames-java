package games;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String... __) {
        Scanner in = new Scanner(System.in);
        String userName = Utils
                .welcomeToBrainGames("Answer \"yes\" if given number is prime. Otherwise answer \"no\".");
        Utils.isCorrectNumber(userName, (val) -> {
            if (val == 1 || val == 0)
                return false;
            for (int i = 2; i < val / 2; i++) {
                if (val % i == 0)
                    return false;
            }
            return true;
        });
    }
}
