package org.study.tddpasswordchecker.book.ch7.autodebit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.study.tddpasswordchecker.book.ch7.autodebit.CardValidity.*;

class StubAutoDebitRegisterTest {

    private AutoDebitRegister register;
    private StubCardNumberValidator stubValidator;
    private StubAutoDebitInfoRepository stubRepository;

    @BeforeEach
    void setUp() {
        stubValidator = new StubCardNumberValidator();
        stubRepository = new StubAutoDebitInfoRepository();
        register = new AutoDebitRegister(stubValidator, stubRepository);
    }

    @Test
    void validCard() {
        // Given - 유효하지 않은 카드번호 세팅
        stubValidator.setInvalidNo("12345678");

        assertValidity("user1", "1234", VALID);
    }

    @Test
    void invalidCard() {
        // Given - 유효하지 않은 카드번호 세팅
        stubValidator.setInvalidNo("1234123412341234");

        assertValidity("user1", "1234123412341234", INVALID);
    }

    @Test
    void theftCard() {
        // Given - 도난 카드번호 세팅
        stubValidator.setTheftNo("123456789");

        assertValidity("user1", "123456789", THEFT);
    }

    void assertValidity(String userId, String cardNumber, CardValidity expected) {
        AutoDebitReq req = new AutoDebitReq(userId, cardNumber);
        RegisterResult result = register.register(req);
        assertThat(result.getValidity()).isEqualTo(expected);
    }

}