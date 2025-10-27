package racingcar.domain;

import java.util.Random;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private int position;
    private static final int MOVE_THRESHOLD = 4;
    private static final int RANDOM_BOUND = 10;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    void moveWithNumber(int number) {
        if (number >= MOVE_THRESHOLD) {
            this.position++;
        }
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        Random random = new Random();
        moveWithNumber(random.nextInt(RANDOM_BOUND));
    }

    public boolean isAtPosition(int position) {
        return this.position == position;
    }
}