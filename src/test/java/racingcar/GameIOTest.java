package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class GameIOTest {

    @ParameterizedTest
    @CsvSource(value = {":false", "pobi,woni:true", "pobi,javaji:false"}, delimiter = ':')
    @DisplayName("입력한 문자열이 요건에 맞는지 테스트. 별도 요건으로는 없지만, 경주이므로 쉼표가 하나 이상 있는 경우만 true로 간주.")
    void string_is_correct(String s, boolean expected) {
        boolean result = GameIO.isCorrectCarName(s);
        assertThat(result).isEqualTo(expected);
    }


}
