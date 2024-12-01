package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import calculator.enums.ExceptionMessage;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InputTypeSorterTest {
    private InputTypeSorter inputTypeSorter;

    @BeforeEach
    void set_up() {
        this.inputTypeSorter = new InputTypeSorter(
                List.of(EmptyInputType.of(), BasicInputType.of(), CustomInputType.of()));
    }

    @Test
    void 빈_문자열인_경우() {
        assertThat(inputTypeSorter.sort(null)).isInstanceOf(EmptyInputType.class);
        assertThat(inputTypeSorter.sort("")).isInstanceOf(EmptyInputType.class);
    }

    @Test
    void 커스텀_구분자인_경우() {
        assertThat(inputTypeSorter.sort("//;\\n1;2;3")).isInstanceOf(CustomInputType.class);
    }

    @Test
    void 기본_구분자_콜론인_경우() {
        assertThat(inputTypeSorter.sort("1:2:3:4")).isInstanceOf(BasicInputType.class);
    }

    @Test
    void 기본_구분자_콤마인_경우() {
        assertThat(inputTypeSorter.sort("1,2,3,4")).isInstanceOf(BasicInputType.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1.2.3", "//\\n1;2;3", "//:\\n1:2:3", "//,\\n1,2,3", "//;1;2;3", ";\\n1;2;3", ":",
            "1,,2,3", "1:2::3", "1,2:3", "//;[\\n1;2;3"})
    void 사용자가_잘못된_형식으로_입력한_경우_예외(String input) {
        assertThatThrownBy(() -> inputTypeSorter.sort(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessage.INVALID_INPUT.valueOf());
    }
}
