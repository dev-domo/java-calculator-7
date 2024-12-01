package calculator.util;

import calculator.enums.ExceptionMessage;

public class StringUtil {
    public static String[] splitText(String text, String delimiter) {
        return checkInvalidDelimiter(text.split(delimiter), text);
    }

    private static String[] checkInvalidDelimiter(String[] splitted, String originalText) {
        if (isNotSplitted(splitted, originalText)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
        }
        return splitted;
    }

    private static boolean isNotSplitted(String[] splitted, String originalText) {
        return splitted.length <= 1 && splitted[0].equals(originalText);
    }
}
