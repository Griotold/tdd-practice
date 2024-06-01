package org.study.tddpasswordchecker.book.ch7.autodebit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class AutoDebitRegister_Fake_Test {

    private AutoDebitRegister register;
    private StubCardNumberValidator stubValidator;
    private MemoryAutoDebitInfoRepository repository;

    @BeforeEach
    void setUp() {
        stubValidator = new StubCardNumberValidator();
        repository = new MemoryAutoDebitInfoRepository();
        register = new AutoDebitRegister(stubValidator, repository);
    }

    void assertValidity(String userId, String cardNumber, CardValidity expected) {
        AutoDebitReq req = new AutoDebitReq(userId, cardNumber);
        RegisterResult result = register.register(req);
        assertThat(result.getValidity()).isEqualTo(expected);
    }

    @Test
    void alreadyRegistered_infoUpdated() {
        repository.save(new AutoDebitInfo("user1", "1111222233334444", LocalDateTime.now()));

        AutoDebitReq req = new AutoDebitReq("user1", "123456789012");
        RegisterResult result = register.register(req);

        AutoDebitInfo saved = repository.findOne("user1");
        assertThat(saved.gerCardNumber()).isEqualTo("123456789012");
    }

    @Test
    void notYetRegistered_newInfoRegistered() {
        AutoDebitReq req = new AutoDebitReq("user1", "1234123412341234");
        RegisterResult result = register.register(req);

        AutoDebitInfo saved = repository.findOne("user1");
        assertThat(saved.gerCardNumber()).isEqualTo("1234123412341234");
    }

}