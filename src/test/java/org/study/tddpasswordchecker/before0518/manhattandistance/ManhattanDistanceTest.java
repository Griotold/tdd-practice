package org.study.tddpasswordchecker.before0518.manhattandistance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ManhattanDistanceTest {
    ManhattanDistance manhattanDistance;

    @BeforeEach
    void setUp() {
        manhattanDistance = new ManhattanDistance();
    }

    void assertDistance(Point point1, Point point2, int expected) {
        int result = manhattanDistance.calculate(point1, point2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void from_one_and_one_to_one_and_one_then_return_0() {
        assertDistance(new Point(1, 1), new Point(1, 1), 0);
    }

    @Test
    void from_five_and_four_to_three_and_two_then_return_4() {
        assertDistance(new Point(5, 4), new Point(3, 2), 4);
    }

    @Test
    void from_one_and_one_to_zero_and_three_then_return_3() {
        assertDistance(new Point(1, 1), new Point(0, 3), 3);
    }

}
