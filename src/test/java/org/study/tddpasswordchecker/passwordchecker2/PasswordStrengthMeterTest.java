package org.study.tddpasswordchecker.passwordchecker2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.study.tddpasswordchecker.passwordchecker.PasswordStrength;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 책에 있는거 따라쳐보기
 * 2024-05-05
 */
public class PasswordStrengthMeterTest {

    private PasswordStrengthMeter meter = new PasswordStrengthMeter();

    private void assertStrength(String password, PasswordStrength expStr) {
        PasswordStrength result = meter.meter(password);
        assertThat(result).isEqualTo(expStr);
    }

    // 첫 번째 테스트는 가장 쉽거나 가장 예외적인 상황을 선택해야 한다.
    @DisplayName("암호가 모든 조건을 충족하면 암호 강도는 '강함'이어야 함")
    @Test
    void meetsAllCriteria_Then_String() throws Exception {
        assertStrength("ab12!@AB", PasswordStrength.STRONG);

        assertStrength("abc1!Add", PasswordStrength.STRONG);
    }

    @DisplayName("길이만 8글자 미만이고 나머지 조건은 충족하는 경우 -> '보통'")
    @Test
    void meetsOtherCriteria_except_for_Length_Then_Normal() throws Exception {
        assertStrength("ab12!@A", PasswordStrength.NORMAL);

        assertStrength("Ab12!c", PasswordStrength.NORMAL);
    }

    @DisplayName("숫자를 포함하지 않고 나머지 조건은 충족하는 경우 -> '보통'")
    @Test
    void meetsOtherCriteria_except_for_number_Then_Normal() throws Exception {
        assertStrength("ab!@ABqwer", PasswordStrength.NORMAL);
    }

    @DisplayName("입력이 null 인 경우 -> INVALID")
    @Test
    void nullInput_Then_Invalid() throws Exception {
        assertStrength(null, PasswordStrength.INVALID);
    }

    @DisplayName("입력이 빈 값인 경우 -> INVALID")
    @Test
    void emptyInput_Then_Invalid() throws Exception {
        assertStrength("", PasswordStrength.INVALID);
    }

    @DisplayName("대문자를 포함하지 않고 나머지 조건을 충족하는 경우 -> '보통'")
    @Test
    void meetsOtherCriteria_except_for_Uppercase_Then_Normal() throws Exception {
        assertStrength("ab12!@df", PasswordStrength.NORMAL);
    }

    @DisplayName("길이가 8글자 이상인 조건만 충족하는 경우 -> '약함'")
    @Test
    void meetsOnlyLengthCriteria_Then_Weak() throws Exception {
        assertStrength("abcdefghi", PasswordStrength.WEAK);
    }

}
