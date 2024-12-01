package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void 숫자_리스트_덧셈() {
        Calculator calculator = new Calculator();

        assertThat(calculator.calculate(List.of(1, 2, 3))).isEqualTo(6);
    }
}
