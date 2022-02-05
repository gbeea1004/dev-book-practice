package study.effectivejava.chap6.item34;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PayrollDayTest {

    @DisplayName("평일, 주말 연장 수당 검증")
    @Test
    void overtimePay() {
        assertThat(PayrollDay.MONDAY.pay(8 * 60, 1)).isEqualTo(480);
        assertThat(PayrollDay.THURSDAY.pay(8 * 60, 1)).isEqualTo(480);
        assertThat(PayrollDay.WEDNESDAY.pay(8 * 60, 1)).isEqualTo(480);
        assertThat(PayrollDay.THURSDAY.pay(8 * 60, 1)).isEqualTo(480);
        assertThat(PayrollDay.FRIDAY.pay(8 * 60, 1)).isEqualTo(480);
        assertThat(PayrollDay.SATURDAY.pay(8 * 60, 1)).isEqualTo(720);
        assertThat(PayrollDay.SUNDAY.pay(8 * 60, 1)).isEqualTo(720);

        assertThat(PayrollDay.MONDAY.pay(9 * 60, 1)).isEqualTo(570);
        assertThat(PayrollDay.THURSDAY.pay(9 * 60, 1)).isEqualTo(570);
        assertThat(PayrollDay.WEDNESDAY.pay(9 * 60, 1)).isEqualTo(570);
        assertThat(PayrollDay.THURSDAY.pay(9 * 60, 1)).isEqualTo(570);
        assertThat(PayrollDay.FRIDAY.pay(9 * 60, 1)).isEqualTo(570);
        assertThat(PayrollDay.SATURDAY.pay(9 * 60, 1)).isEqualTo(810);
        assertThat(PayrollDay.SUNDAY.pay(9 * 60, 1)).isEqualTo(810);
    }
}