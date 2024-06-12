package org.study.tddpasswordchecker.kim.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class VisibleStudentsTest {
    private VisibleStudents visibleStudents;

    @BeforeEach
    void setUp() throws Exception {
        this.visibleStudents = new VisibleStudents();
    }

    void assertCount(String input, int expected) {
        int result = visibleStudents.retrieveStudentsCount(input);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("100 110 120 -> 3")
    @Test
    void testOne() {
        assertCount("100 110 120", 3);
    }

    @DisplayName("120 110 100 -> 1")
    @Test
    void testTwo() {
        assertCount("120 110 100", 1);
    }

    @DisplayName("120 110 130 135 125 -> 3")
    @Test
    void testThree() {
        assertCount("120 110 130 135 125", 3);
    }

    @DisplayName("문제에서 제시한 테스트 케이스")
    @Test
    void testFour() {
        assertCount("130 135 148 140 145 150 150 153", 5);
    }
}
