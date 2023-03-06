package homework15;

public class Driver extends Human {

    private String carType;

    public Driver(String name, int age, String profession, String carType) {
        super(name, age, profession);
        this.carType = carType;
    }

    public Driver() {
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Я маю водійське посвідчення!");
    }
}
