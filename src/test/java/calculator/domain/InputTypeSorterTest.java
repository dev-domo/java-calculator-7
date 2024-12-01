package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class InputTypeSorterTest {
    @Test
    void 빈_문자열인_경우() {
        assertThat(InputTypeSorter.sort(null)).isInstanceOf(EmptyInputType.class);
        assertThat(InputTypeSorter.sort("")).isInstanceOf(EmptyInputType.class);
    }

    @Test
    void 커스텀_구분자인_경우() {
        assertThat(InputTypeSorter.sort("//;\\n1;2;3")).isInstanceOf(CustomInputType.class);
    }

    @Test
    void 기본_구분자_콜론인_경우() {
        assertThat(InputTypeSorter.sort("1:2:3:4")).isInstanceOf(BasicInputType.class);
    }

    @Test
    void 기본_구분자_콤마인_경우() {
        assertThat(InputTypeSorter.sort("1,2,3,4")).isInstanceOf(BasicInputType.class);
    }
}
