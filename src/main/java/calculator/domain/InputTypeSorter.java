package calculator.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputTypeSorter {
    private static final String CUSTOM_REGEX = "//(.)\\\\n(.*)";
    private static final String BASIC_REGEX = "((\\d*)[,:](\\d*))*";
    private static final Pattern CUSTOM_PATTERN = Pattern.compile(CUSTOM_REGEX);
    private static final Pattern BASIC_PATTERN = Pattern.compile(BASIC_REGEX);

    public static InputType sort(String input) {
        if (input == null || input.isBlank()) {
            return new EmptyInputType(input);
        }
        Matcher matcher = CUSTOM_PATTERN.matcher(input);
        if (matcher.find()) {
            return new CustomInputType(input);
        }
        matcher = BASIC_PATTERN.matcher(input);
        if (matcher.find()) {
            return new BasicInputType(input);
        }
        return null;
    }
}
