package models;

public class Camel extends  PackAnimal{

    protected String animal_type = "Верблюд";

    public Camel(String name, String commands, String birthdate) {
        super(name, commands, birthdate);
    }

    @Override
    public String toString() {
        return "models.Camel{" +
                "animal_type='" + animal_type + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", commands='" + commands + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
