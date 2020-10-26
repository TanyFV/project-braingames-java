package games;

import java.util.Scanner;
import java.util.function.Predicate;
import java.io.IOException;

public class Utils {

    public static String welcomeToBrainGames(String str, String userName) {

        return userName;
    }

    public static void isCorrectNumber(String userName, Predicate<Integer> predicate) {

    }

    public static char getCharacterFromUser() throws IOException {
        final String LINE_SEPARATOR = System.lineSeparator();
        byte[] input = new byte[1 + LINE_SEPARATOR.length()];
        if (System.in.read(input) != input.length)
            throw new RuntimeException("Пользователь ввёл недостаточное кол-во символов");
        return (char) input[0];
    }

}
