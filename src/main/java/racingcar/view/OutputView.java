package racingcar.view;

import racingcar.domain.Car;
import java.util.List;

public class OutputView {

    public void printExecutionResultHeader() {
        System.out.println("\n실행 결과");
    }

    public void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            String result = car.getName() + " : " + "-".repeat(car.getPosition());
            System.out.println(result);
        }
        System.out.println(); // 라운드 구분 공백
    }
}