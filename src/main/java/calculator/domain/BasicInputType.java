package calculator.domain;

import java.util.List;

public class BasicInputType implements InputType {
    private final String input;

    public BasicInputType(final String input) {
        this.input = input;
    }

    @Override
    public List<Integer> extractNumbers() {
        return null;
    }
}
