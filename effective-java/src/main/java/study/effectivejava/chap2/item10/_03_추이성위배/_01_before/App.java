package study.effectivejava.chap2.item10._03_추이성위배._01_before;

public class App {

    public static void main(String[] args) {
        // 대칭성 -> 만족
        System.out.println("===대칭성===");
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        System.out.println(p.equals(cp));
        System.out.println(cp.equals(p));

        // 추이성 -> 위배
        System.out.println("===추이성===");
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3)); // 색상이 다르므로 false
    }
}
