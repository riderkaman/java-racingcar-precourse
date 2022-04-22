package racingcar;

public class Car {

    CarName carName;
    GoCount goCount;

    public Car() {

    }

    public Car(CarName carName) {
        this.carName = carName;
        this.goCount = new GoCount();
    }
}
