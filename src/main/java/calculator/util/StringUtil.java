package calculator.util;

import static calculator.enums.NumberCharacters.MAXIMUM_INTEGER_LETTER;
import static calculator.enums.NumberCharacters.MINIMUM_INTEGER_LETTER;

import calculator.enums.ExceptionMessage;

public class StringUtil {
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
                .filter(letter -> letter < MINIMUM_INTEGER_LETTER.valueOf()
                        || letter > MAXIMUM_INTEGER_LETTER.valueOf())
                .findFirst()
                .isPresent();
    }

    private static boolean isNotSplitted(String[] splitted, String originalText) {
        return splitted[0].equals(originalText);
    }
}
