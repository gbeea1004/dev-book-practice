package study.effectivejava.chap2.item10._01_equals_일반규약;

/**
 * Object 명세에 적힌 equals 메서드 재정의 규약
 */
public class App {

    public static void main(String[] args) {
        Car car1 = new Car("포르쉐 타이칸", 100);
        Car car2 = new Car("포르쉐 타이칸", 100);

        // 반사성
        System.out.println(car1.equals(car2));

        // 대칭성
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));

        // 추이성
        System.out.println(car1.getName().equals(car2.getName()));
        System.out.println(car1.getSpeed().equals(car2.getSpeed()));

        // 일관성
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car2));

        // null-아님
        System.out.println(!car1.equals(null));
        System.out.println(!car2.equals(null));
    }
}
