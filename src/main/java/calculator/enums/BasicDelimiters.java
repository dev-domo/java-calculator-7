package calculator.enums;

import java.util.Arrays;

public enum BasicDelimiters {
    COMMA(","),
    COLON(":");

    private final String name;

    BasicDelimiters(final String name) {
        this.name = name;
    }

    public String valueOf() {
        return name;
    }

    public static String getDelimiters() {
        return String.join("|", Arrays.stream(BasicDelimiters.values())
                .map(delimiter -> delimiter.name)
                .toList());
    }
}
