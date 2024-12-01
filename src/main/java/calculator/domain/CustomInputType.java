package calculator.domain;

import java.util.List;

public class CustomInputType implements InputType {
    private final String input;

    public CustomInputType(final String input) {
        this.input = input;
    }

    @Override
    public List<Integer> extractNumbers() {
        return null;
    }
}
