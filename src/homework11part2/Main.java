package homework11part2;

//1. Створити клас автомобіль та 2 його потомки: легковий та вантажний
//2. У кожному класі повинен бути перевизначений метод, який повертає тип автомобіля

public class Main {

    public static void main(String[] args) {
        PassengerCar car = new PassengerCar();
        Truck car1 = new Truck();
        System.out.println(car.getCarType());
        System.out.println(car1.getCarType());
    }
}
