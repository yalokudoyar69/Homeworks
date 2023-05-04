package homework33;

import java.util.Random;

public class ThreadForNumbers extends Thread {

    private Random random = new Random();

    @Override
    public void run() {
        int number;
        while (true) {
            number = random.nextInt(10) + 1;
            System.out.print(" " + number);
            if (number == 5) {
                break;
            }
        }
    }
}

