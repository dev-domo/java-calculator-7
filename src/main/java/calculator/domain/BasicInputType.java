package calculator.domain;

import calculator.enums.BasicDelimiters;
import calculator.util.IntegerUtil;
import calculator.util.StringUtil;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicInputType implements InputType {
    private final String input;

    private BasicInputType(final String input) {
        this.input = input;
    }

    public static BasicInputType of(final String input) {
        return new BasicInputType(input);
    }

    @Override
    public List<Integer> extractNumbers() {
        return Arrays.stream(StringUtil.splitText(input, BasicDelimiters.getDelimiters()))
                .map(IntegerUtil::parseText)
                .collect(Collectors.toList());
    }
}
