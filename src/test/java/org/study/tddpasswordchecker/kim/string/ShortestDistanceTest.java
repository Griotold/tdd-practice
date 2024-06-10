package org.study.tddpasswordchecker.kim.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShortestDistanceTest {

    private ShortestDistance shortestDistance;

    @BeforeEach
    void setUp() {
        this.shortestDistance = new ShortestDistance();
    }

    @DisplayName("ab, b -> 1 0")
    @Test
    void testOne() {
        String input = "ab";
        char target = 'b';
        String result = shortestDistance.getEachDistances(input, target);
        Assertions.assertThat(result).isEqualTo("1 0");
    }
}
