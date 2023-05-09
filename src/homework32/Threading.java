package homework32;

public class Threading implements Runnable {
        private final String threadName;

        public Threading (String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + i);
            }
        }
    }
