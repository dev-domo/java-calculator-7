package calculator.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IntegerUtilTest {
    @Test
    void 문자를_숫자로_변환() {
        assertThat(IntegerUtil.parseText("3")).isEqualTo(3);
    }
}
