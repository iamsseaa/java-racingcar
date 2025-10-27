package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingGameController {

    private final InputView inputView;
    private final OutputView outputView;

    public RacingGameController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        startRace();
    }

    private void startRace() {
        List<String> carNames = inputView.readCarNames();
        RacingGame racingGame = new RacingGame(createCars(carNames));

        int attemptCount = inputView.readAttemptCount();
        runRounds(racingGame, attemptCount);
        outputView.printWinners(racingGame.getWinners());
    }

    private List<Car> createCars(List<String> carNames) {
        return carNames.stream()
                .map(Car::new)
                .toList();
    }

    private void runRounds(RacingGame racingGame, int attemptCount) {
        outputView.printExecutionResultHeader(); // 수정
        for (int i = 0; i < attemptCount; i++) {
            racingGame.playRound();
            outputView.printRoundResult(racingGame.getCars());
        }
    }

}