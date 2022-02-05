package study.effectivejava.chap6.item34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @DisplayName("enum 의 상수별 메서드 검증")
    @Test
    void enumApply() {
        final double x = 4.0;
        final double y = 2.0;

        assertThat(Operation.PLUS.apply(x, y)).isEqualTo(6.0);
        assertThat(Operation.MINUS.apply(x, y)).isEqualTo(2.0);
        assertThat(Operation.TIMES.apply(x, y)).isEqualTo(8.0);
        assertThat(Operation.DIVIDE.apply(x, y)).isEqualTo(2.0);
    }

    @DisplayName("enum 을 toString 으로 출력하기")
    @Test
    void enumToString() {
        for (Operation value : Operation.values()) {
            System.out.println("value = " + value);
        }
    }

    @DisplayName("열거 타입용 fromString 검증")
    @Test
    void fromString() {
        Operation plus = getOperation("+");
        Operation minus = getOperation("-");
        Operation times = getOperation("*");
        Operation divide = getOperation("/");

        assertThat(plus.toString()).isEqualTo("+");
        assertThat(minus.toString()).isEqualTo("-");
        assertThat(times.toString()).isEqualTo("*");
        assertThat(divide.toString()).isEqualTo("/");

        assertThrows(IllegalArgumentException.class, () -> getOperation("a"));
    }

    private Operation getOperation(String symbol) {
        return Operation.fromString(symbol)
                        .orElseThrow(IllegalArgumentException::new);
    }
}