package calculator.domain;

import static calculator.enums.Patterns.CUSTOM_PATTERN;

import calculator.util.IntegerUtil;
import calculator.util.StringUtil;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class CustomInputType implements InputType {
    private static final int DELIMITER_PLACE = 1;
    private static final int REAL_INPUT_PLACE = 2;

    private final String input;
    private final Matcher matcher;

    public CustomInputType(final String input) {
        this.input = input;
        this.matcher = CUSTOM_PATTERN.valueOf().matcher(input);
    }

    @Override
    public List<Integer> extractNumbers() {
        if (matcher.find()) {
            return Arrays.stream(StringUtil.splitText(findRealInput(), findDelimiter()))
                    .map(IntegerUtil::parseText)
                    .collect(Collectors.toList());
        }
        throw new IllegalArgumentException();
    }

    private String findDelimiter() {
        return matcher.group(DELIMITER_PLACE);
    }

    private String findRealInput() {
        return matcher.group(REAL_INPUT_PLACE);
    }
}
