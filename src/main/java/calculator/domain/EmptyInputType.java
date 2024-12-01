package calculator.domain;

import java.util.List;

public class EmptyInputType implements InputType {

    private EmptyInputType() {
    }

    public static InputType of() {
        return new EmptyInputType();
    }

    @Override
    public boolean matches(String input) {
        return input == null || input.isEmpty();
    }

    @Override
    public List<Integer> extractNumbers(String input) {
        return List.of(0);
    }
}
