package racingcar.domain;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private int position;

    public Car(String name) {
        // 이름 예외 처리는 다음 커밋에서 구현
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}