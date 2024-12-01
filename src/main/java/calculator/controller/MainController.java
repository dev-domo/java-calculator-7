package calculator.controller;

import calculator.domain.BasicInputType;
import calculator.domain.Calculator;
import calculator.domain.CustomInputType;
import calculator.domain.EmptyInputType;
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
        String input = inputView.inputStringToSolve();
        printAdditionResult(createNumbers(sortInputType(input), input));
    }

    private void printPromptForInput() {
        outputView.promptForInput();
    }

    private List<Integer> createNumbers(InputType inputType, String input) {
        return inputType.extractNumbers(input);
    }

    private void printAdditionResult(List<Integer> numbers) {
        outputView.showResult(Calculator.CALCULATOR.addition(numbers));
    }

    private InputType sortInputType(String input) {
        InputTypeSorter inputTypeSorter = new InputTypeSorter(
                List.of(EmptyInputType.of(), BasicInputType.of(), CustomInputType.of()));
        return inputTypeSorter.sort(input);
    }
}
