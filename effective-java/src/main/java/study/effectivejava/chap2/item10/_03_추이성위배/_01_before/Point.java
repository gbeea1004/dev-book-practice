package study.effectivejava.chap2.item10._03_추이성위배._01_before;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Point {

    private final int x;
    private final int y;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }
}
