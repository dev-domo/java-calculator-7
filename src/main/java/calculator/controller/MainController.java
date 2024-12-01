package calculator.controller;

import calculator.domain.Calculator;
import calculator.domain.InputType;
import calculator.domain.InputTypeSorter;
import calculator.view.InputView;
import calculator.view.OutputView;

public class MainController {

    private final InputView inputView;
    private final OutputView outputView;

    public MainController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        outputView.promptForInput();
        InputType inputType = InputTypeSorter.sort(inputView.inputStringToSolve());
        Calculator calculator = new Calculator();

        outputView.showResult(calculator.calculate(inputType.extractNumbers()));
    }
}
