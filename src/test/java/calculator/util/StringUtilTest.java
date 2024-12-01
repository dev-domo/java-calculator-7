package calculator.util;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import calculator.enums.ExceptionMessage;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void 구분자를_기준으로_문자열_나누기() {
        assertThat(StringUtil.splitText("1,2,3", ",")).containsExactly("1", "2", "3");
    }

    @Test
    void 문자열에_포함된_구분자와_split_기준이_되는_구분자가_서로_다르면_예외() {
        assertThatThrownBy(() -> StringUtil.splitText("1,2,3", ":"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessage.INVALID_INPUT.valueOf());
    }

    @Test
    void 숫자로_바꿀_수_있는_단일_문자는_예외_처리_금지() {
        assertThat(StringUtil.splitText("25", ":")).containsExactly("25");
    }
}
