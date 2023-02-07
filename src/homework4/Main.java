package homework4;

public class Main {

    public static void main(String[] args) {
        String str = "Betelgeuse";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));
        int length = str.length();
        int lastIndex = length - 1;
        System.out.println(str.charAt(lastIndex));
    }
}
