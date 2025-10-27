package racingcar.controller;

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
        // 1. 자동차 이름 입력
        List<String> carNames = inputView.readCarNames();

        // (입력받은 이름으로 Car 객체 생성 로직은 추후 추가)
    }
}