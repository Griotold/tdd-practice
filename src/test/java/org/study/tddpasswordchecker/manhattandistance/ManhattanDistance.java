package org.study.tddpasswordchecker.manhattandistance;

public class ManhattanDistance {
    public int calculate(Point point1, Point point2) {
        return Math.abs(point1.getX() - point2.getX()) + Math.abs(point1.getY() - point2.getY());
    }
}
