package org.study.tddpasswordchecker.before0518.expirydatecalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 책 3장 - 서비스 만료일 계산 기능
 * */
public class ExpiryDateCalculatorTest {

    private void assertExpiryDate(PayData payData, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(payData);

        assertThat(expiryDate).isEqualTo(expectedExpiryDate);
    }

    @Test
    @DisplayName("만원 납부하면 한달 뒤가 만료일이 됨")
    void 만원_납부하면_한달_뒤가_만료일이_됨() throws Exception {
        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2019, 3, 1))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 4, 1));
        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2019, 5, 5))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 6, 5));

    }

    @Test
    @DisplayName("납부일과 한달 뒤 일자가 같지 않음")
    void 납부일과_한달_뒤_일자가_같지_않음() throws Exception {
        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2019, 1, 31))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 2, 28));
        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2019, 5, 31))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2019, 6, 30));
        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2020,1,31))
                        .payAmount(10_000)
                        .build(),
                LocalDate.of(2020, 2, 29));
    }

    @Test
    @DisplayName("첫 납부일과 만료일의 일자가 같지 않을 때 1만원 납부하면 첫 납부일 기준으로 다음 만료일 정함")
    void 첫_납부일과_만료일_일자가_다를때_만원_납부() throws Exception {
        PayData payData = new PayData(
                LocalDate.of(2019, 1, 31),
                LocalDate.of(2019, 2, 28),
                10_000);

        assertExpiryDate(payData, LocalDate.of(2019, 3, 31));

        PayData payData2 = PayData.builder()
                .firstBillingDate(LocalDate.of(2019, 1, 30))
                .billingDate(LocalDate.of(2019, 2, 28))
                .payAmount(10_000)
                .build();

        assertExpiryDate(payData2, LocalDate.of(2019, 3, 30));

        PayData payData3 = PayData.builder()
                .firstBillingDate(LocalDate.of(2019, 5, 31))
                .billingDate(LocalDate.of(2019, 6, 30))
                .payAmount(10_000)
                .build();

        assertExpiryDate(payData3, LocalDate.of(2019, 7, 31));
    }

    @Test
    @DisplayName("2만원 이상 납부시 만료일은 비례해서 계산")
    void 이만원_이상_납부하면_비례해서_만료일_계산() throws Exception {
        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2019, 3, 1))
                        .payAmount(20_000)
                        .build(),
                LocalDate.of(2019, 5, 1)
        );

        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2019, 3, 1))
                        .payAmount(30_000)
                        .build(),
                LocalDate.of(2019, 6, 1)
        );
    }

    @Test
    @DisplayName("첫 납부일과 만료일 일자가 다를 때 2만원 이상 납부시")
    void 첫_납부일과_만료일_일자가_다를때_이만원_이상_납부() throws Exception {
        assertExpiryDate(
                PayData.builder()
                        .firstBillingDate(LocalDate.of(2019, 1, 31))
                        .billingDate(LocalDate.of(2019, 2, 28))
                        .payAmount(20_000)
                        .build(),
                LocalDate.of(2019, 4, 30)
        );

        assertExpiryDate(
                PayData.builder()
                        .firstBillingDate(LocalDate.of(2019, 1, 31))
                        .billingDate(LocalDate.of(2019, 2, 28))
                        .payAmount(40_000)
                        .build(),
                LocalDate.of(2019, 6, 30)
        );

        assertExpiryDate(
                PayData.builder()
                        .firstBillingDate(LocalDate.of(2019, 3, 31))
                        .billingDate(LocalDate.of(2019, 4, 30))
                        .payAmount(30_000)
                        .build(),
                LocalDate.of(2019, 7, 31)
        );
    }
    @DisplayName("10만원을 납부하면 1년 제공")
    @Test
    void 십만원을_납부하면_1년_제공() throws Exception {
        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2019, 1, 28))
                        .payAmount(100_000)
                        .build(),
                LocalDate.of(2020, 1, 28));

        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2020, 2, 29))
                        .payAmount(100_000)
                        .build(),
                LocalDate.of(2021, 2, 28));
    }

    @DisplayName("10만원 이상 납부하면 비례해서 계산")
    @Test
    void 십만원_이상을_납부하면_비례해서_계산() {
        assertExpiryDate(
                PayData.builder()
                        .billingDate(LocalDate.of(2019, 1, 28))
                        .payAmount(130_000)
                        .build(),
                LocalDate.of(2020, 4, 28));
    }
}
