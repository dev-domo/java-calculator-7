package calculator.util;

import calculator.enums.ExceptionMessage;

public class StringUtil {
    public static String[] splitText(String text, String delimiter) {
        String[] splitted = text.split(delimiter);
        checkInvalidDelimiter(splitted[0], text);
        return splitted;
    }

    private static void checkInvalidDelimiter(String splittedText, String originalText) {
        if (splittedText.equals(originalText)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
        }
    }
}
