package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CustomInputTypeTest {
    @Test
    void 커스텀_구분자_기준으로_나누어_숫자_리스트를_반환한다() {
        assertThat(CustomInputType.of().extractNumbers("//;\\n1;2;3"))
                .containsExactly(1, 2, 3);
    }
}
