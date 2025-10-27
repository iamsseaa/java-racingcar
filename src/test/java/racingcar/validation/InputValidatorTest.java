package racingcar.validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValidatorTest {

    @Test
    @DisplayName("유효한 자동차 이름 입력")
    void validateCarNames_Success() {
        assertThatCode(() -> InputValidator.validateCarNames("pobi,woni,jun"))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("자동차 이름 중복 시 예외 발생")
    void validateCarNames_Duplicates_ThrowsException() {
        assertThatThrownBy(() -> InputValidator.validateCarNames("pobi,woni,pobi"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복될 수 없습니다");
    }

    @Test
    @DisplayName("자동차 이름이 쉼표로 끝날 시 예외 발생")
    void validateCarNames_EndsWithDelimiter_ThrowsException() {
        assertThatThrownBy(() -> InputValidator.validateCarNames("pobi,woni,"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("쉼표(,)로 끝날 수 없습니다");
    }

    @Test
    @DisplayName("자동차 이름 입력이 빈 값일 시 예외 발생")
    void validateCarNames_EmptyInput_ThrowsException() {
        assertThatThrownBy(() -> InputValidator.validateCarNames(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력되지 않았습니다");
    }
}