package calculator.util;

import calculator.enums.ExceptionMessage;

public class StringUtil {
    private static final Character MINIMUM_INTEGER_LETTER = '0';
    private static final Character MAXIMUM_INTEGER_LETTER = '9';

    public static String[] splitText(String text, String delimiter) {
        return checkInvalidDelimiter(text.split(delimiter), text);
    }

    private static String[] checkInvalidDelimiter(String[] splitted, String originalText) {
        if (isNotSingleNumber(originalText) && isNotSplitted(splitted, originalText)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
        }
        return splitted;
    }

    private static boolean isNotSingleNumber(String originalText) {
        return originalText.chars()
                .filter(letter -> letter < MINIMUM_INTEGER_LETTER || letter > MAXIMUM_INTEGER_LETTER)
                .findFirst()
                .isPresent();
    }

    private static boolean isNotSplitted(String[] splitted, String originalText) {
        return splitted[0].equals(originalText);
    }
}
