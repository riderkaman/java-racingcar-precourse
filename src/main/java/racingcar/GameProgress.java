package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class GameProgress {

    static CarNames carNames;
    static Cars cars;
    static TryCount tryCount;

    public static void gameStart() {
        boolean isCarNamesNotCorrectInput = true;
        while (isCarNamesNotCorrectInput) {
            isCarNamesNotCorrectInput = inputCarNames();
        }

        boolean isTryCountNotCorrectInput = true;
        while (isTryCountNotCorrectInput) {
            isTryCountNotCorrectInput = inputTryCount();
        }

    }

    private static boolean inputTryCount() {

        System.out.println("시도할 횟수는 몇회인가요?");

        try {
            tryCount = new TryCount(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return true;
        }

        return false;
    }

    private static boolean makeCarName() {

        try {
            cars = new Cars(carNames);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return true;
        }

        return false;
    }

    private static boolean inputCarNames() {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        try {
            carNames = new CarNames(Console.readLine());
            return makeCarName();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return true;
        }

    }

}
