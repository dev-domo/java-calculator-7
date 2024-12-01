package calculator.controller;

import calculator.domain.Calculator;
import calculator.domain.InputType;
import calculator.domain.InputTypeSorter;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class MainController {

    private final InputView inputView;
    private final OutputView outputView;

    public MainController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        printPromptForInput();
        InputType inputType = sortInputType();
        printAdditionResult(createNumbers(inputType));
    }

    private void printPromptForInput() {
        outputView.promptForInput();
    }

    private List<Integer> createNumbers(InputType inputType) {
        return inputType.extractNumbers();
    }

    private void printAdditionResult(List<Integer> numbers) {
        outputView.showResult(Calculator.CALCULATOR.addition(numbers));
    }

    private InputType sortInputType() {
        return InputTypeSorter.SORTER.sort(inputView.inputStringToSolve());
    }
}
