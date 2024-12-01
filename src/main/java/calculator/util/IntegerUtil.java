package calculator.util;

import calculator.enums.ExceptionMessage;

public class IntegerUtil {
    public static int parseText(String text) {
        try {
            int number = Integer.parseInt(text);
            checkPositive(number);
            return number;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
        }
    }

    private static void checkPositive(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
        }
    }
}
