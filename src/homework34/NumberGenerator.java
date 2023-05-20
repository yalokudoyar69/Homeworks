package homework34;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int ranNumb = random.nextInt(50) + 1;
        return ranNumb;
    }
}
