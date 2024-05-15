package org.study.tddpasswordchecker.expirydatecalculator0515;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;

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
        assertThat(expiryDate).isEqualTo(LocalDate.of(2019, 4, 1));

        LocalDate billingDate2 = LocalDate.of(2019, 5, 5);
        int payAmount2 = 10_000;

        ExpiryDateCalculator0515 cal2 = new ExpiryDateCalculator0515();
        LocalDate expiryDate2 = cal2.calculateExpiryDate(billingDate2, payAmount2);
        assertThat(expiryDate2).isEqualTo(LocalDate.of(2019, 6, 5));

    }

}
