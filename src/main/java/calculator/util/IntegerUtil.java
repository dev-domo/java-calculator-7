package calculator.util;

import calculator.enums.ExceptionMessage;

public class IntegerUtil {
    public static int parseText(String text) {
        try {
            return checkPositive(Integer.parseInt(text));
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
        }
    }

    private static int checkPositive(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
        }
        return number;
    }
}
