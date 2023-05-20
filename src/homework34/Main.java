package homework34;

//Створити callable поток, який повертає випадково згенероване число від 1 до 50. Зробити пул с 10 потоків для виклику цього методу.

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
         try {
             for (int i = 0; i < 10; i++) {
                 Callable<Integer> NumberGenerator = new NumberGenerator();
                 Future<Integer> future = executor.submit(NumberGenerator);
                 int ranNumb = future.get();
                 System.out.println("Випадкове число: " + ranNumb);
             }
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             executor.shutdown();

             }
            }
    }
