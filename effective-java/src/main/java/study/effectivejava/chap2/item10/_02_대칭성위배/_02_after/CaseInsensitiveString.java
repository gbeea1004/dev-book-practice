package study.effectivejava.chap2.item10._02_대칭성위배._02_after;

import java.util.Objects;

public final class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    /**
     * String 과 연동하겠다는 허황된 꿈을 버리기
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }
}
