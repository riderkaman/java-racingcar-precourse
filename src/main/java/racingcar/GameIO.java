package racingcar;

public class GameIO {


    public static boolean isCorrectCarName(String s) {

        if (s == null) {
            return false;
        }

        if (!s.contains(",")) {
            return false;
        }

        String[] names = s.split(",");

        for (int i = 0; i < names.length; i++) {

        }

        return true;
    }
}
