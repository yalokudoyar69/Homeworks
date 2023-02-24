package homework11part2;

public class PassengerCar extends Car {

    private int numberOfPassengers;

    public PassengerCar(String brandName, String model, int year, String color, int numberOfPassengers) {
        super(brandName, model, year, color);
        this.numberOfPassengers = numberOfPassengers;
    }

    public PassengerCar() {
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String getCarType() {
        return "Passenger car";
    }
}
