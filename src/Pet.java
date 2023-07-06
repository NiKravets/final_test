public class Pet extends Animals{
    protected String category;
    public  Pet(String name, String commands, String birthdate) {
        super(name, commands, birthdate);
        this.category = "Домашнее животное";
    }
}
