package racingcar.validation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputValidator {

    private static final String DELIMITER = ",";

    private InputValidator() {
    }

    public static List<String> validateCarNames(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("자동차 이름이 입력되지 않았습니다.");
        }
        if (input.endsWith(DELIMITER)) {
            throw new IllegalArgumentException("자동차 이름 입력이 쉼표(,)로 끝날 수 없습니다.");
        }

        List<String> names = Arrays.asList(input.split(DELIMITER));
        validateDuplicates(names);

        return names;
    }

    private static void validateDuplicates(List<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        if (uniqueNames.size() != names.size()) {
            throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
        }
    }

    public static int validateAttemptCount(String input) {
        int count;
        try {
            count = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }

        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
        return count;
    }
}