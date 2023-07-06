public class Donkey extends PackAnimal{

    protected String animal_type = "Осел";

    public Donkey(String name, String commands, String birthdate) {
        super(name, commands, birthdate);
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "animal_type='" + animal_type + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", commands='" + commands + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
