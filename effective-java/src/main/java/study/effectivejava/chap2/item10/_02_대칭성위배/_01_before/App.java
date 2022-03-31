package study.effectivejava.chap2.item10._02_대칭성위배._01_before;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "Polish";
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis)); // 대칭성 위배

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        System.out.println(list.contains(s)); // OpenJDK 버전이 바뀌거나 다른 JDK 에서는 true 를 반환하거나 런타임 예외를 던질 수도 있다.
    }
}
