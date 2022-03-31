package study.effectivejava.chap2.item10._03_추이성위배._02_after;

import study.effectivejava.chap2.item10._03_추이성위배._01_before.Color;
import study.effectivejava.chap2.item10._03_추이성위배._01_before.Point;

public class App {

    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.RED);

        System.out.println(p1.asPoint().equals(p2));
        System.out.println(p2.equals(p3.asPoint()));
        System.out.println(p1.equals(p3));
    }
}
