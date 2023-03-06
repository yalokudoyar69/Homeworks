package homework15;

//1. Створити клас людина і двох потомків. Водій та пілот. Створити інтерфейс для описання процесу водіння. Зробити так, щоб цей клас імплементував цей інтерфейс.
//2. Створити інтерфейс який описує вміння літати і імплементувати його.
//3. У головному класі викликати методи летати та водити авто за допомогою інтерфейсів і поліморфізму.

public class Main {
    public static void main(String[] args) {
        Flying fl1 = new Pilot();
        Driving dr1 = new Driver();

        fl1.fly();
        dr1.drive();

        Human human = new Pilot("Alex", 32, "ghjghg", "jet");
        Driver driver = new Driver("Max", 26, "водій", "passenger car");

        human.fly();
        driver.drive();
    }
}
