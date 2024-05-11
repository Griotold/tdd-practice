package org.study.tddpasswordchecker.expirydatecalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;

/**
 * 책 3장 - 서비스 만료일 계산 기능
 * */
public class ExpiryDateCalculatorTest {

    private void assertExpiryDate(LocalDate billingDate, int payAmount, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate, payAmount);

        assertThat(expectedExpiryDate).isEqualTo(expiryDate);
    }

    @Test
    @DisplayName("만원 납부하면 한달 뒤가 만료일이 됨")
    void 만원_납부하면_한달_뒤가_만료일이_됨() throws Exception {
        assertExpiryDate(LocalDate.of(2019, 3, 1), 10_000,
                LocalDate.of(2019, 4, 1));

        assertExpiryDate(LocalDate.of(2019, 5, 5), 10_000,
                LocalDate.of(2019, 6, 5));

    }
}
