package calculator.domain;

import java.util.List;

public enum Calculator {
    CALCULATOR;

    public int addition(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }
}
