package org.study.tddpasswordchecker.kim.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ShortestDistanceTest {

    private ShortestDistance shortestDistance;

    @BeforeEach
    void setUp() {
        this.shortestDistance = new ShortestDistance();
    }

    private void assertDistance(String input, char target, String expected) {
        String result = shortestDistance.getEachDistances(input, target);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("ab, b -> 1 0")
    @Test
    void testOne() {
        assertDistance("ab", 'b', "1 0");
    }

    @DisplayName("abc, b -> 1 0 1")
    @Test
    void testThree() {
        assertDistance("abc", 'b', "1 0 1");
    }

    @DisplayName("teachermode e -> 1 0 1 2 1 0 1 2 2 1 0")
    @Test
    void testFour() {
        assertDistance("teachermode", 'e', "1 0 1 2 1 0 1 2 2 1 0");
    }
}
