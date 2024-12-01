package calculator.util;

import calculator.enums.ExceptionMessage;

public class IntegerUtil {
    public static int parseText(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
        }
    }
}
