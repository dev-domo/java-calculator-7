package calculator.enums;

public enum OutputMessage {
    INPUT_STRING_TO_ADD("덧셈할 문자열을 입력해주세요."),
    RESULT("결과 : ");

    private final String message;

    OutputMessage(final String message) {
        this.message = message;
    }

    public String valueOf() {
        return message;
    }
}
