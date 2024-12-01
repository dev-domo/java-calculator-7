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

    private void printAdditionResult(List<Integer> numbers) {
        outputView.showResult(Calculator.CALCULATOR.calculate(numbers));
    }

    private List<Integer> createNumbers(InputType inputType) {
        return inputType.extractNumbers();
    }

    private InputType sortInputType() {
        return InputTypeSorter.sort(inputView.inputStringToSolve());
    }

    private void printPromptForInput() {
        outputView.promptForInput();
    }
}
