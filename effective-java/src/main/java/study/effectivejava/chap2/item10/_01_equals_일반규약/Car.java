package study.effectivejava.chap2.item10._01_equals_일반규약;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class Car {

    private String name;
    private Integer speed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(speed, car.speed);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, speed);
//    }
}
