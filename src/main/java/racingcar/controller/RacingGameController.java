package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.RacingGame;
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
        RacingGame racingGame = new RacingGame(createCars(carNames));

        int attemptCount = inputView.readAttemptCount();
        runRounds(racingGame, attemptCount);
    }

    private List<Car> createCars(List<String> carNames) {
        return carNames.stream()
                .map(Car::new)
                .toList();
    }

    private void runRounds(RacingGame racingGame, int attemptCount) {
        System.out.println("\n실행 결과");
        for (int i = 0; i < attemptCount; i++) {
            racingGame.playRound();
        }
    }

}