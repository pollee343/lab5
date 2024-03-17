package commands;

public abstract class AbstrCommand implements Command{
    private String name;
    private String description;

    public AbstrCommand(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String toStringg(){
        return name + " (" + description + ")";
    }
    //сравнение по equals и hashcode -?

}
