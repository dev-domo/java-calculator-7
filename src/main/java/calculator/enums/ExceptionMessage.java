package calculator.enums;

public enum ExceptionMessage {
    INVALID_INPUT("[ERROR] 잘못된 입력입니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String valueOf() {
        return message;
    }
}
