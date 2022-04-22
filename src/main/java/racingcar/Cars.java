package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    List<Car> cars;

    public Cars() {

    }

    public Cars(CarNames carNames) {
        cars = new ArrayList<>();

        for (String name : carNames.carNameSplit()) {
            CarName carName = new CarName(name);
            cars.add(new Car(carName));
        }
    }
}
