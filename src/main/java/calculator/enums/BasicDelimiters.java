package calculator.enums;

public enum BasicDelimiters {
    COMMA(","),
    COLON(":");

    private final String delimiter;

    BasicDelimiters(final String delimiter) {
        this.delimiter = delimiter;
    }

    public String valueOf() {
        return delimiter;
    }
}
