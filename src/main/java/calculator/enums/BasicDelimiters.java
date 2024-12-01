package calculator.enums;

import java.util.Arrays;
import java.util.regex.Matcher;

public enum BasicDelimiters {
    COMMA(","),
    COLON(":");

    private static final String TYING_UP = "|";
    private static final int DELIMITER_PLACE = 1;

    private final String name;

    BasicDelimiters(final String name) {
        this.name = name;
    }

    public String valueOf() {
        return name;
    }

    public static String getDelimiters() {
        return String.join(TYING_UP, Arrays.stream(BasicDelimiters.values())
                .map(delimiter -> delimiter.name)
                .toList());
    }

    public static boolean notContainsInMatcher(Matcher matcher) {
        String delimiter = matcher.group(DELIMITER_PLACE);
        return !delimiter.equals(COLON.valueOf()) && !delimiter.equals(COMMA.valueOf());
    }
}
