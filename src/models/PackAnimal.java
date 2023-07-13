package models;

public class PackAnimal extends Animals {
    protected String category;
    public  PackAnimal(String name, String commands, String birthdate) {
        super(name, commands, birthdate);
        this.category = "Вьючное животное";

    }
}
