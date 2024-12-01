package calculator.domain;

import calculator.util.IntegerUtil;
import calculator.util.StringUtil;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicInputType implements InputType {
    private static final String BASIC_DELIMITER = "[,:]";

    private final String input;

    public BasicInputType(final String input) {
        this.input = input;
    }

    @Override
    public List<Integer> extractNumbers() {
        return Arrays.stream(StringUtil.splitText(input, BASIC_DELIMITER))
                .map(IntegerUtil::parseText)
                .collect(Collectors.toList());
    }
}
