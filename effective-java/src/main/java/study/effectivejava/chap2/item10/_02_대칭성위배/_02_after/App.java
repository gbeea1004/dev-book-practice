package study.effectivejava.chap2.item10._02_대칭성위배._02_after;

public class App {

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        CaseInsensitiveString cis2 = new CaseInsensitiveString("Polish");
        System.out.println(cis.equals(cis2));
        System.out.println(cis2.equals(cis));
    }
}
