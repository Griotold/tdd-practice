package org.study.tddpasswordchecker.book.ch7.userregister;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserRegisterTest {
    private UserRegister userRegister;
    private StubWeakPasswordChecker stubWeakPasswordChecker = new StubWeakPasswordChecker();
    private MemoryUserRepository fakeRepository = new MemoryUserRepository();
    private SpyEmailNotifier spyEmailNotifier = new SpyEmailNotifier();

    @BeforeEach
    void setUp() {
        userRegister = new UserRegister(stubWeakPasswordChecker, fakeRepository, spyEmailNotifier);
    }

    @DisplayName("약한 암호면 가입 실패")
    @Test
    void weakPassword() {
        stubWeakPasswordChecker.setWeak(true);

        assertThatThrownBy(() -> userRegister.register("id", "pw", "email"))
                .isInstanceOf(WeakPasswordException.class);
    }

    @DisplayName("중복 ID로는 가입 실패")
    @Test
    void duplicateId() {
        fakeRepository.save(new User("id", "pw", "email"));

        assertThatThrownBy(() -> userRegister.register("id", "pw", "email"))
                .isInstanceOf(DupIdException.class);
    }

    @DisplayName("같은 ID가 없으면 가입 성공")
    @Test
    void noDupId_register_success() {
        userRegister.register("id", "pw", "email");

        User user = fakeRepository.findById("id");
        assertThat(user.getId()).isEqualTo("id");
        assertThat(user.getPassword()).isEqualTo("pw");
    }

    @DisplayName("가입하면 메일을 전송함")
    @Test
    void when_register_then_send_mail() {
        userRegister.register("id", "pw", "email@email.com");

        assertThat(spyEmailNotifier.isCalled()).isTrue();
        assertThat(spyEmailNotifier.getEmail()).isEqualTo("email@email.com");

    }

}
