package comjosim74.github.rrfoundationtutorial;

/**
 * Created by MD JOSIM UDDIN on 1/8/2017.
 */

public class Students {
    private String name,roll;

    public Students(String name, String roll){
        this.name= name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
