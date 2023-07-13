package models;

public class Dog extends Pet{
    protected String animal_type = "Собака";

    public Dog(String name, String commands, String birthdate) {
        super(name, commands, birthdate);
    }

    @Override
    public String toString() {
        return "models.Dog{" +
                "animal_type='" + animal_type + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", commands='" + commands + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
