package homework11part2;

public class Car {
    protected String brandName;
    protected String model;
    protected int year;
    protected String color;

    public Car() {

    }

    public Car(String brandName, String model, int year, String color) {
        this.brandName = brandName;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
    public String getCarType () {
        return "car";
    }
}
