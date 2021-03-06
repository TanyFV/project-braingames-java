package games;

import java.io.IOException;

public class Choice {
    // private static final Logger log =
    // org.slf4j.LoggerFactory.getLogger(Choice.class);

    public static void main(String... __) throws IOException {

        System.out.println("Выберите игру:");
        System.out.println("1 - Проверка на четность");
        System.out.println("2 - Простые числа");
        System.out.println("3 - Калькулятор");
        System.out.println("0 - Закончить");
        switch (Utils.getCharacterFromUser()) {
            case '1':
                BrainGames.main();
                break;
            case '2':
                PrimeNumbers.main();
                break;
            case '3':
                Calculator.main();
                break;
            case '0':
                return;
            default:
                System.out.println("Игры с таким номером нет!");
        }
    }
}
