package calculator.domain;

import static calculator.enums.Patterns.BASIC_PATTERN;
import static calculator.enums.Patterns.CUSTOM_PATTERN;

import java.util.regex.Matcher;

public enum InputTypeSorter {
    SORTER;

    public InputType sort(String input) {
        if (isEmpty(input)) {
            return new EmptyInputType(input);
        }
        if (isContainsCustomDelimiter(input)) {
            return new CustomInputType(input);
        }
        if (isContainsBasicDelimiter(input)) {
            return new BasicInputType(input);
        }
        return null;
    }

    private boolean isEmpty(String input) {
        return input == null || input.isBlank();
    }

    private boolean isContainsCustomDelimiter(String input) {
        return getCustomMatcher(input).find();
    }

    private boolean isContainsBasicDelimiter(String input) {
        return getBasicMatcher(input).find();
    }

    private Matcher getBasicMatcher(String input) {
        return BASIC_PATTERN.valueOf().matcher(input);
    }

    private static Matcher getCustomMatcher(String input) {
        return CUSTOM_PATTERN.valueOf().matcher(input);
    }
}
