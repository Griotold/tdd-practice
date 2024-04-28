package org.study.tddpasswordchecker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class PasswordMeterTest {
    private PasswordMeter passwordMeter = new PasswordMeter();

    @DisplayName("null 이면 예외 발생")
    @Test
    void nullInput() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> passwordMeter.meter(null));
    }

    @DisplayName("빈 값이면 예외 발생")
    @Test
    void emptyInput() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> passwordMeter.meter(""));
    }

    public void assertPasswordStrength(String pw, PasswordStrength expected) {
        PasswordStrength actual = passwordMeter.meter(pw);
        assertThat(actual).isEqualTo(expected);
    }

    @DisplayName("모든 조건을 충족하면 강함")
    @Test
    void meetAllRules() {
        assertPasswordStrength("abcABC123", PasswordStrength.STRONG);
    }

    @DisplayName("길이가 8 미만이고, 다른조건은 충족하면 보통")
    @Test
    void digitAndUppercase() {
        assertPasswordStrength("abcC123", PasswordStrength.NORMAL);
        assertPasswordStrength("abC12", PasswordStrength.NORMAL);
        assertPasswordStrength("Cabc12", PasswordStrength.NORMAL);
    }

    @DisplayName("대문자 없음, 다른 조건 충족 -> 보통")
    @Test
    void digitAndLength() {
        assertPasswordStrength("abcd12345", PasswordStrength.NORMAL);
    }

    @DisplayName("숫자 없음, 다른 조건 충족 -> 보통")
    @Test
    void upperAndLength() {
        assertPasswordStrength("ABCabcde", PasswordStrength.NORMAL);
    }

    @DisplayName("길이만 충족 -> 약함")
    @Test
    void length() {
        assertPasswordStrength("abcdefghi", PasswordStrength.WEAK);
    }

    @DisplayName("대문자만 충족 -> 약함")
    @Test
    void uppdercase() {
        assertPasswordStrength("ABCDI", PasswordStrength.WEAK);
    }

    @DisplayName("숫자만 충족 -> 약함")
    @Test
    void digit() {
        assertPasswordStrength("1234", PasswordStrength.WEAK);
    }

    @DisplayName("아무것도 충족 X -> 약함")
    @Test
    void no() {
        assertPasswordStrength("abc", PasswordStrength.WEAK);
    }
}
