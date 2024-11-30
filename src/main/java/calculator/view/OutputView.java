package calculator.view;

import calculator.enums.OutputMessage;

public class OutputView {
    public void promptForInput() {
        System.out.println(OutputMessage.INPUT_STRING_TO_ADD.valueOf());
    }

    public void showResult(int result) {
        System.out.println(OutputMessage.RESULT.valueOf() + result);
    }
}
