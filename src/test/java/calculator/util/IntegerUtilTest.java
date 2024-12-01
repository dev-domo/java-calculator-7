package calculator.util;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import calculator.enums.ExceptionMessage;
import org.junit.jupiter.api.Test;

public class IntegerUtilTest {
    @Test
    void 문자를_숫자로_변환() {
        assertThat(IntegerUtil.parseText("3")).isEqualTo(3);
    }

    @Test
    void 숫자로_변환할_수_없는_문자인_경우_예외() {
        assertThatThrownBy((() -> IntegerUtil.parseText("가")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessage.INVALID_INPUT.valueOf());
    }
}
