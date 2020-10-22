package games;

import java.util.Scanner;
import java.io.IOException;

public class Choice {
    public static void main(String... __) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите игру:");
        System.out.println("1 - Проверка на четность");
        System.out.println("2 - Простые числа");
        switch (System.in.read()) {
            case '1':
                BrainGames.main();
                break;
            case '2':
                PrimeNumbers.main();
                break;
            default:
                System.out.println("Игры с таким номером нет!");
        }
        in.close();
    }

}
