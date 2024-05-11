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

    @Test
    @DisplayName("만원 납부하면 한달 뒤가 만료일이 됨")
    void 만원_납부하면_한달_뒤가_만료일이_됨() throws Exception {
        LocalDate billingDate = LocalDate.of(2019, 3, 1);
        int payAmount = 10_000;

        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate, payAmount);

        assertThat(expiryDate).isEqualTo(LocalDate.of(2019, 4, 1));

        LocalDate billingDate2 = LocalDate.of(2019, 5, 5);
        LocalDate expiryDate2 = cal.calculateExpiryDate(billingDate2, payAmount);

        assertThat(expiryDate2).isEqualTo(LocalDate.of(2019, 6, 5));

    }
}
