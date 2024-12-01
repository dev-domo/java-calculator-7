package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class EmptyInputTypeTest {
    @Test
    void 빈_문자열인_경우_0만_담긴_숫자_리스트를_반환한다() {
        EmptyInputType emptyInputType = new EmptyInputType(null);
        
        assertThat(emptyInputType.extractNumbers()).containsExactly(0);
    }
}
