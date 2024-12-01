package calculator.domain;

import java.util.List;

public class EmptyInputType implements InputType {
    private final String input;

    private EmptyInputType(final String input) {
        this.input = input;
    }

    public static InputType of(final String input) {
        return new EmptyInputType(input);
    }

    @Override
    public List<Integer> extractNumbers() {
        return List.of(0);
    }
}
