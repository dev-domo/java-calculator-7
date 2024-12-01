package calculator;

import calculator.controller.MainController;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        MainController controller = new MainController(new InputView(), new OutputView());
        controller.start();
    }
}
