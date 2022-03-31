package study.effectivejava.chap2.item10._03_추이성위배._02_after;

import study.effectivejava.chap2.item10._03_추이성위배._01_before.Color;
import study.effectivejava.chap2.item10._03_추이성위배._01_before.Point;

import java.util.Objects;

public class ColorPoint {

    private final Point point; // 상속 대신 컴포지션을 사용
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
