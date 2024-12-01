package calculator.domain;

import static calculator.enums.Patterns.BASIC_PATTERN;
import static calculator.enums.Patterns.CUSTOM_PATTERN;

import java.util.regex.Matcher;

public enum InputTypeSorter {
    SORTER;

    public InputType sort(String input) {
        if (input == null || input.isBlank()) {
            return new EmptyInputType(input);
        }
        Matcher matcher = getCustomMatcher(input);
        if (matcher.find()) {
            return new CustomInputType(input);
        }
        matcher = BASIC_PATTERN.valueOf().matcher(input);
        if (matcher.find()) {
            return new BasicInputType(input);
        }
        return null;
    }

    private static Matcher getCustomMatcher(String input) {
        return CUSTOM_PATTERN.valueOf().matcher(input);
    }
}
