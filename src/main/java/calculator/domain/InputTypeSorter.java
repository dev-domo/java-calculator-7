package calculator.domain;

import static calculator.enums.Patterns.BASIC_COLON_PATTERN;
import static calculator.enums.Patterns.BASIC_COMMA_PATTERN;
import static calculator.enums.Patterns.CUSTOM_PATTERN;

import calculator.enums.ExceptionMessage;
import java.util.regex.Matcher;

public enum InputTypeSorter {
    SORTER;

    public InputType sort(String input) {
        if (isEmpty(input)) {
            return EmptyInputType.of(input);
        }
        if (isContainsCustomDelimiter(input)) {
            return CustomInputType.of(input);
        }
        if (isContainsBasicDelimiter(input)) {
            return BasicInputType.of(input);
        }
        throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf());
    }

    private boolean isEmpty(String input) {
        return input == null || input.isBlank();
    }

    private boolean isContainsCustomDelimiter(String input) {
        Matcher matcher = getCustomMatcher(input);
        return matcher.find() && CUSTOM_PATTERN.containsNotBasicDelimiter(matcher);
    }

    private boolean isContainsBasicDelimiter(String input) {
        return getBasicColonMatcher(input).find() || getBasicCommaMatcher(input).find();
    }

    private Matcher getBasicCommaMatcher(String input) {
        return BASIC_COMMA_PATTERN.valueOf().matcher(input);
    }

    private Matcher getBasicColonMatcher(String input) {
        return BASIC_COLON_PATTERN.valueOf().matcher(input);
    }

    private static Matcher getCustomMatcher(String input) {
        return CUSTOM_PATTERN.valueOf().matcher(input);
    }
}
