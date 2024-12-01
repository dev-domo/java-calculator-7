package calculator.domain;

import java.util.List;

public class EmptyInputType implements InputType {
    private final String input;

    public EmptyInputType(String input) {
        this.input = input;
    }

    @Override
    public List<Integer> extractNumbers() {
        return List.of(0);
    }
}
