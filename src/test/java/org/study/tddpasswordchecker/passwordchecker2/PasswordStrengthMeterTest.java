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

    // 첫 번째 테스트는 가장 쉽거나 가장 예외적인 상황을 선택해야 한다.
    @DisplayName("암호가 모든 조건을 충족하면 암호 강도는 강함이어야 함")
    @Test
    void meetsAllCriteria_Then_String() throws Exception {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@AB");
        assertThat(result).isEqualTo(PasswordStrength.STRONG);
        PasswordStrength result2 = meter.meter("abc1!Add");
        assertThat(result2).isEqualTo(PasswordStrength.STRONG);
    }
}
