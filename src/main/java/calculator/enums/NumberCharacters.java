package calculator.enums;

public enum NumberCharacters {
    MINIMUM_INTEGER_LETTER('0'),
    MAXIMUM_INTEGER_LETTER('9');

    private final Character letter;

    NumberCharacters(final Character letter) {
        this.letter = letter;
    }

    public Character valueOf() {
        return letter;
    }
}
