package homework28;

//Використовувати методи с пакету NIO, створити класс з 2 функціями.
// Перша зберігає отриману строку у файл. Друга - зчитує дані з файлу та повертає його користувачу.

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void saveToFile(String content, String filePath) throws IOException {
        byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
        Path path = Paths.get(filePath);
        Files.write(path, bytes);
    }

    public static String readFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        String content = "Mondays sucks";
        String filePath = "data2.text";
        try {
            saveToFile(content, filePath);
            String fileContent = readFromFile(filePath);
            System.out.println("Зміст файлу: " + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
