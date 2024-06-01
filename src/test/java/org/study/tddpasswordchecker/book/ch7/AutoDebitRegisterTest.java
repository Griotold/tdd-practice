package org.study.tddpasswordchecker.book.ch7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.study.tddpasswordchecker.book.ch7.CardValidity.*;

class AutoDebitRegisterTest {

    private AutoDebitRegister register;

    @BeforeEach
    void setUp() {
        CardNumberValidator validator = new CardNumberValidator();
        AutoDebitInfoRepository repository = new JpaAutoDebitInfoRepository();
        register = new AutoDebitRegister(validator, repository);
    }

    @Test
    void validCard() {
        // 업체에서 받은 테스트용 유효한 카드번호 사용
        AutoDebitReq req = new AutoDebitReq("user1", "1234");
        RegisterResult result = register.register(req);
        assertThat(result.getValidity()).isEqualTo(VALID);
    }

    @Test
    void invalidCard() {
        // 업체에서 받은 테스트용 Invalid 카드번호 사용
        AutoDebitReq req = new AutoDebitReq("user1", "1234123412341234");
        RegisterResult result = register.register(req);
        assertThat(result.getValidity()).isEqualTo(INVALID);
    }

    @Test
    void theftCard() {
        // 업체에서 받은 도난 테스트용 카드번호 사용

        AutoDebitReq req = new AutoDebitReq("user1", "123456789");
        RegisterResult result = register.register(req);
        assertThat(result.getValidity()).isEqualTo(THEFT);
    }

}