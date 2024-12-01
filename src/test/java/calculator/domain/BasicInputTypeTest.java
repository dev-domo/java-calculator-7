package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BasicInputTypeTest {
    @ParameterizedTest
    @ValueSource(strings = {"1,2,3", "1:2:3"})
    void 빈_문자열인_경우_0만_담긴_숫자_리스트를_반환한다(String input) {
        assertThat(BasicInputType.of(input).extractNumbers()).containsExactly(1, 2, 3);
    }
}
