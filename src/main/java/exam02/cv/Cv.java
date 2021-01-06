package exam02.cv;


import java.util.List;

public class Cv {

    private String Name;
    private String name;

    public Cv(String Name, List<Skill>) {
    this.Name = Name;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
