public class Horse extends PackAnimal{

    protected String animal_type = "Лошадь";

    public Horse(String name, String commands, String birthdate) {
        super(name, commands, birthdate);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "animal_type='" + animal_type + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", commands='" + commands + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
