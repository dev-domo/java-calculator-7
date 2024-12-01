package calculator.domain;

import calculator.enums.ExceptionMessage;
import java.util.List;

public class InputTypeSorter {
    private final List<InputType> inputTypes;

    public InputTypeSorter(final List<InputType> inputTypes) {
        this.inputTypes = inputTypes;
    }

    public InputType sort(String input) {
        return inputTypes.stream()
                .filter(inputType -> inputType.matches(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.valueOf()));
    }
}
