package homework27;

//Створити класс з 2 функціями.
// Перша зберігає отриману строку у файл. Друга - зчитує дані з файлу та повертає його користувачу.

import java.io.*;
import java.util.Scanner;

public class Main {

        public static void SaveToFile(String fileName, String data) {
            try {
                OutputStream ous = new FileOutputStream(fileName);
                ous.write(data.getBytes());
                ous.close();
            } catch (IOException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        public static String readFromFile(String fileName) {
            StringBuilder contentBuilder = new StringBuilder();
            try {
                InputStream ins = new FileInputStream(fileName);
                BufferedReader brd = new BufferedReader(new InputStreamReader(ins));
                String line;
                while ((line = brd.readLine()) != null) {
                    contentBuilder.append(line);
                    contentBuilder.append(System.lineSeparator());
                }
                brd.close();
            } catch (IOException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
            return contentBuilder.toString();

        }
    public static void main(String[] args) {
        String fileName = "data.txt";
        String data = "Mondays sucks";

        SaveToFile(fileName, data);
        String content = readFromFile(fileName);
        System.out.println("Зміст файлу:");
        System.out.println(content);
    }
}

