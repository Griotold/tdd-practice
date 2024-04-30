package org.study.tddpasswordchecker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdminBlockTest {
    @DisplayName("새로 생성한 관리자는 차단 상태가 아님")
    @Test
    void newCreatedAdmin_NonBlock() {
        Admin admin = new Admin();
        assertThat(admin.isBlocked()).isFalse();
    }
}
