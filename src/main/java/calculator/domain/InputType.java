package calculator.domain;

import java.util.List;

public interface InputType {
    boolean matches(String input);

    List<Integer> extractNumbers(String input);
}
