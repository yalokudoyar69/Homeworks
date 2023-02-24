package homework11part2;

public class Truck extends Car {

    private int loadCapacity;

    public Truck(String brandName, String model, int year, String color, int loadCapacity) {
        super(brandName, model, year, color);
        this.loadCapacity = loadCapacity;
    }
    public Truck() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getCarType() {
        return "Truck";
    }
}
