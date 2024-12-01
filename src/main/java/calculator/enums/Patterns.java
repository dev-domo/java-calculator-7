package calculator.enums;

import java.util.regex.Pattern;

public enum Patterns {
    CUSTOM_PATTERN(Pattern.compile("//(.)\\\\n(.*)")),
    BASIC_PATTERN(Pattern.compile("((\\d*)[,:](\\d*))*"));

    private final Pattern pattern;

    Patterns(final Pattern pattern) {
        this.pattern = pattern;
    }

    public Pattern valueOf() {
        return pattern;
    }
}
