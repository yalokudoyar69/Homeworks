package homework20;

//Мапа потрібна містити інформацію про 10 будь-яких слів українською мовою і її переклад на:
//англійську, японську, німецьку. Коли користувач дає мапі слово українською - то потрібен отримати у результаті переклад на ці 3 мови.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Map<String, String>> ukrEngJapGerDictionary = new HashMap<>();

        Map<String, String> word1Transl = new HashMap<>();
        word1Transl.put("англійська", "girl");
        word1Transl.put("японська", "女の子");
        word1Transl.put("німецька", "Mädchen");
        ukrEngJapGerDictionary.put("дівчина", word1Transl);

        Map<String, String> word2Transl = new HashMap<>();
        word2Transl.put("англійська", "boy");
        word2Transl.put("японська", "男の子");
        word2Transl.put("німецька", "Junge");
        ukrEngJapGerDictionary.put("хлопчик", word2Transl);

        Map<String, String> word3Transl = new HashMap<>();
        word3Transl.put("англійська", "mother");
        word3Transl.put("японська", "母親");
        word3Transl.put("німецька", "Mutter");
        ukrEngJapGerDictionary.put("мама", word3Transl);

        Map<String, String> word4Transl = new HashMap<>();
        word4Transl.put("англійська", "father");
        word4Transl.put("японська", "父親");
        word4Transl.put("німецька", "Vater");
        ukrEngJapGerDictionary.put("батько", word4Transl);

        Map<String, String> word5Transl = new HashMap<>();
        word5Transl.put("англійська", "cat");
        word5Transl.put("японська", "猫");
        word5Transl.put("німецька", "Katze");
        ukrEngJapGerDictionary.put("кіт", word5Transl);

        Map<String, String> word6Transl = new HashMap<>();
        word6Transl.put("англійська", "animal");
        word6Transl.put("японська", "動物");
        word6Transl.put("німецька", "Tier");
        ukrEngJapGerDictionary.put("тварина", word6Transl);

        Map<String, String> word7Transl = new HashMap<>();
        word7Transl.put("англійська", "sky");
        word7Transl.put("японська", "空");
        word7Transl.put("німецька", "Himmel");
        ukrEngJapGerDictionary.put("небо", word7Transl);

        Map<String, String> word8Transl = new HashMap<>();
        word8Transl.put("англійська", "clouds");
        word8Transl.put("японська", "雲");
        word8Transl.put("німецька", "Wolken");
        ukrEngJapGerDictionary.put("хмари", word8Transl);

        Map<String, String> word9Transl = new HashMap<>();
        word9Transl.put("англійська", "sun");
        word9Transl.put("японська", "太陽");
        word9Transl.put("німецька", "Sonne");
        ukrEngJapGerDictionary.put("сонце", word9Transl);

        Map<String, String> word10Transl = new HashMap<>();
        word10Transl.put("англійська", "universe");
        word10Transl.put("японська", "宇宙");
        word10Transl.put("німецька", "Universum");
        ukrEngJapGerDictionary.put("всесвіт", word10Transl);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово українською з маленької літери для подальшого перекладу:");
        String uaWord = scanner.nextLine();

        Map<String, String> transl = ukrEngJapGerDictionary.get(uaWord);
        if (transl != null) {
            System.out.println("Переклади");
            for (Map.Entry<String, String> entry : transl.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            } else {
                System.out.println("Переклад відсутній");
            }

            }

    }
