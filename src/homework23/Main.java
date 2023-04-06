package homework23;

//Створити лист з 20 прізвищами. Вони повинні повторюватися. За допомогою стрім апі перетворити цей лист на мапу.
//У якості ключа повинно бути прізвище, а в якості значення - кількість повторень його.
//Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API.

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        List<String> listOfSurnames = Arrays.asList("Арутюнов", "Мигальський", "Ковтун", "Кудояр", "Гаргола", "Івасенко", "Чернега", "Ларцев", "Щеголенко", "Ладижева", "Кудояр",
//                "Ковтун", "Гмирко", "Гаргола", "Чернега", "Івасенко", "Ковтун", "Румянцев", "Ларцев", "Ковтун");
//        Map<String, Long> mapOfSurnames = listOfSurnames.stream()
//                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
//        System.out.println(mapOfSurnames);
//    }

        List<Integer> listOfRandomNumbers = new Random().ints(15, 1, 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(listOfRandomNumbers);

        int sum = listOfRandomNumbers.stream()
                .mapToInt(Integer::intValue).sum();
        System.out.println("Сума: " + sum);

    }
}
