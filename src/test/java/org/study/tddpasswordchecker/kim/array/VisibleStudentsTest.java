package org.study.tddpasswordchecker.kim.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VisibleStudentsTest {
    private VisibleStudents visibleStudents;

    @BeforeEach
    void setUp() throws Exception {
        this.visibleStudents = new VisibleStudents();
    }

    @DisplayName("100 110 120 -> 3")
    @Test
    void testOne() {
        String input = "100 110 120";
        int result = visibleStudents.retrieveStudentsCount(input);
        Assertions.assertThat(result).isEqualTo(3);
    }



}
