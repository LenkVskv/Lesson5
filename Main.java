/**
 * Created by Olenkaa on 09.02.2017.
 */

public class Main {
    public static void main(String[] args) {
        Train t = new CyclicTrain();
        System.out.println(findLength(t));
    }

    public static int findLength(Train train) {
        train.lightOn();
        int index = 0;
        boolean firstCarriage = true;
        while (firstCarriage == true) {
            for (int i = 0; i < index; i++) {
                train.turnRight();
                train.lightOff();
            }
            for (int i = 0; i < index; i++) {
                train.turnLeft();

            }
            if (!train.isLightOn()) {
                return index;
            }
            index++;
        }

        return 0;
    }
}



