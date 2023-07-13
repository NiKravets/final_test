package models;

public class Hamster extends Pet{

    protected String animal_type = "Хомяк";

    public Hamster(String name, String commands, String birthdate) {
        super(name, commands, birthdate);
    }

    @Override
    public String toString() {
        return "models.Hamster{" +
                "animal_type='" + animal_type + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", commands='" + commands + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
