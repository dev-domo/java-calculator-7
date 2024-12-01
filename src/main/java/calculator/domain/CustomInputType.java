package calculator.domain;

import static calculator.enums.Patterns.CUSTOM_PATTERN;

import calculator.enums.BasicDelimiters;
import calculator.util.IntegerUtil;
import calculator.util.StringUtil;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class CustomInputType implements InputType {
    private static final int DELIMITER_PLACE = 1;
    private static final int REAL_INPUT_PLACE = 2;

    private Matcher matcher;

    private CustomInputType() {
    }

    public static InputType of() {
        return new CustomInputType();
    }

    @Override
    public boolean matches(String input) {
        this.matcher = getCustomMatcher(input);
        return matcher.find() && BasicDelimiters.notContainsInMatcher(matcher);
    }

    @Override
    public List<Integer> extractNumbers(String input) {
        Matcher matcher = getCustomMatcher(input);
        if (matcher.find()) {
            return Arrays.stream(StringUtil.splitText(findRealInput(matcher), findDelimiter(matcher)))
                    .map(IntegerUtil::parseText)
                    .collect(Collectors.toList());
        }
        throw new IllegalArgumentException();
    }

    private static Matcher getCustomMatcher(String input) {
        return CUSTOM_PATTERN.valueOf().matcher(input);
    }

    private String findDelimiter(Matcher matcher) {
        return matcher.group(DELIMITER_PLACE);
    }

    private String findRealInput(Matcher matcher) {
        return matcher.group(REAL_INPUT_PLACE);
    }
}
