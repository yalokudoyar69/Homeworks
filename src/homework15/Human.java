package homework15;

public class Human implements Driving, Flying{

    private String name;
    private int age;
    private String profession;

    public Human(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    @Override
    public void drive() {

    }

    @Override
    public void fly() {

    }
}
