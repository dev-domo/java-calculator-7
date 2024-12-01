package calculator.domain;

import static calculator.enums.Patterns.BASIC_COLON_PATTERN;
import static calculator.enums.Patterns.BASIC_COMMA_PATTERN;

import calculator.enums.BasicDelimiters;
import calculator.util.IntegerUtil;
import calculator.util.StringUtil;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class BasicInputType implements InputType {

    private BasicInputType() {
    }

    public static BasicInputType of() {
        return new BasicInputType();
    }

    @Override
    public boolean matches(String input) {
        return getBasicColonMatcher(input).find() || getBasicCommaMatcher(input).find();
    }

    private Matcher getBasicCommaMatcher(String input) {
        return BASIC_COMMA_PATTERN.valueOf().matcher(input);
    }

    private Matcher getBasicColonMatcher(String input) {
        return BASIC_COLON_PATTERN.valueOf().matcher(input);
    }

    @Override
    public List<Integer> extractNumbers(String input) {
        return Arrays.stream(StringUtil.splitText(input, BasicDelimiters.getDelimiters()))
                .map(IntegerUtil::parseText)
                .collect(Collectors.toList());
    }
}
