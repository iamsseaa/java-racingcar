package racingcar.controller;

import racingcar.domain.Car;
import racingcar.view.InputView;
import java.util.List;

public class RacingGameController {

    private final InputView inputView;

    public RacingGameController() {
        this.inputView = new InputView();
    }

    public void run() {
        startRace();
    }

    private void startRace() {
        List<String> carNames = inputView.readCarNames();

        int attemptCount = inputView.readAttemptCount();
    }


}