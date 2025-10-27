package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {

    @Test
    @DisplayName("자동차 생성 성공")
    void createCar_Success() {
        Car car = new Car("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
        assertThat(car.getPosition()).isZero();
    }

    @Test
    @DisplayName("5자를 초과하는 이름으로 자동차 생성 시 예외 발생")
    void createCar_NameTooLong_ThrowsException() {
        assertThatThrownBy(() -> new Car("longname"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("5자 이하");
    }

    @Test
    @DisplayName("공백 이름으로 자동차 생성 시 예외 발생")
    void createCar_BlankName_ThrowsException() {
        assertThatThrownBy(() -> new Car(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("공백일 수 없습니다");
    }

    @Test
    @DisplayName("빈 이름으로 자동차 생성 시 예외 발생")
    void createCar_EmptyName_ThrowsException() {
        assertThatThrownBy(() -> new Car(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("공백일 수 없습니다");
    }
}