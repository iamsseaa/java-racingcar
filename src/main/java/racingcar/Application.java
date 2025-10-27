package racingcar;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import racingcar.controller.RacingGameController;

public class Application {
    public static void main(String[] args) {
        RacingGameController racingGameController = new RacingGameController();
        racingGameController.run();
    }
}