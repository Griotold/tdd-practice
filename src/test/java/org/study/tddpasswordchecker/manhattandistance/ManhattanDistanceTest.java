package org.study.tddpasswordchecker.manhattandistance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ManhattanDistanceTest {

    @Test
    void from_one_and_one_to_one_and_one_then_return_0() {
        ManhattanDistance manhattanDistance = new ManhattanDistance();
        int result = manhattanDistance.calculate(new Point(1, 1), new Point(1, 1));
        assertThat(result).isEqualTo(0);
    }
}
