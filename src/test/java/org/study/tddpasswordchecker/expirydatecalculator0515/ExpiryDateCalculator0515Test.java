package org.study.tddpasswordchecker.expirydatecalculator0515;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 240515 - 3장 요약을 위해 다시 구현
 */
public class ExpiryDateCalculator0515Test {

    private void assertExpiryDate(PayData0515 paydata, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator0515 cal = new ExpiryDateCalculator0515();
        LocalDate expiryDate = cal.calculateExpiryDate(paydata);
        assertThat(expiryDate).isEqualTo(expectedExpiryDate);
    }

    @Test
    void 만원_납부하면_한달_뒤가_만료일이_됨() throws Exception {
        assertExpiryDate(
                PayData0515.builder()
                        .billingDate(LocalDate.of(2019, 3, 1))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 4, 1));
        assertExpiryDate(
                PayData0515.builder()
                        .billingDate(LocalDate.of(2019, 5, 5))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 6, 5));
    }

    @Test
    void 납부일과_한달_뒤_일자가_같지_않음() throws Exception {
        assertExpiryDate(
                PayData0515.builder()
                        .billingDate(LocalDate.of(2019, 1, 31))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 2, 28));
        assertExpiryDate(
                PayData0515.builder()
                        .billingDate(LocalDate.of(2019, 5, 31))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 6, 30));
        assertExpiryDate(
                PayData0515.builder()
                        .billingDate(LocalDate.of(2020, 1, 31))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2020, 2, 29));
    }

    @Test
    void 첫_납부일과_만료일_일자가_다를때_만원_납부() {
        assertExpiryDate(
                PayData0515.builder()
                        .firstBillingDate(LocalDate.of(2019, 1, 31))
                        .billingDate(LocalDate.of(2019, 2, 28))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 3, 31));
    }

}
