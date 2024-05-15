package org.study.tddpasswordchecker.expirydatecalculator0515;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

/**
 * 240515 - 3장 요약을 위해 다시 구현
 * */
public class ExpiryDateCalculator0515Test {

    @Test
    void 만원_납부하면_한달_뒤가_만료일이_됨() throws Exception {
        LocalDate billingDate = LocalDate.of(2019, 3, 1);
        int payAmount = 10_000;

        ExpiryDateCalculator0515 cal = new ExpiryDateCalculator0515();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate, payAmount);
        Assertions.assertThat(expiryDate).isEqualTo(LocalDate.of(2019, 4, 1));

    }

}
