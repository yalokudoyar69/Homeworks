package homework19;

//1. У циклі на 1000 повтореннь сгенерувати випадкові числі діапазоном від 1 до 50 та зберегти їх у різні типи колекцій сет.
//2. Вивести всі 3 варіанти на консоль.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(50) + 1;

            hs.add(randomNumber);
            lhs.add(randomNumber);
            ts.add(randomNumber);
        }

        System.out.println("Hashset:\t\t" + hs);
        System.out.println("LinkedHashSet:\t" + lhs);
        System.out.println("TreeSet:\t\t" + ts);
    }
}
