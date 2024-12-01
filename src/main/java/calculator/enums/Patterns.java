package calculator.enums;

import static calculator.enums.BasicDelimiters.COLON;
import static calculator.enums.BasicDelimiters.COMMA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Patterns {
    CUSTOM_PATTERN(Pattern.compile("//(.)\\\\n(.*)")),
    BASIC_COLON_PATTERN(Pattern.compile("^\\d+(:\\d+)*$")),
    BASIC_COMMA_PATTERN(Pattern.compile("^\\d+(,\\d+)*$"));

    private final Pattern pattern;

    Patterns(final Pattern pattern) {
        this.pattern = pattern;
    }

    public Pattern valueOf() {
        return pattern;
    }

    public boolean containsBasicDelimiter(Matcher matcher) {
        String delimiter = matcher.group(1);
        return delimiter.equals(COLON.valueOf()) || delimiter.equals(COMMA.valueOf());
    }
}
