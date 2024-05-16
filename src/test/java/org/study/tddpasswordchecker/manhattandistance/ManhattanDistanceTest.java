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

    @Test
    void from_five_and_four_to_three_and_two_then_return_4() {
        ManhattanDistance manhattanDistance = new ManhattanDistance();
        int result = manhattanDistance.calculate(new Point(5, 4), new Point(3, 2));
        assertThat(result).isEqualTo(4);
    }


}
