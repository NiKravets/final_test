import java.util.List;

public abstract class Animals {
    protected String name;
    protected List<String> commands;
    protected String birthdate;

    public Animals(String name, List<String> commands, String birthdate) {
        this.name = name;
        this.commands = commands;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", commands='" + commands + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
