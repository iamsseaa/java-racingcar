package racingcar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import racingcar.validation.InputValidator;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = scanner.nextLine();

        // 예외 처리는 다음 커밋에서 InputValidator로 분리
        return InputValidator.validateCarNames(input);
    }

    public int readAttemptCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = scanner.nextLine();
        return InputValidator.validateAttemptCount(input);
    }
}