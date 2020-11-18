package introconstructors;

import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private List  <String> menu;
    private String name;
    private int capacity;


    public Restaurant(String name, int capacity) {
        this.name = name;
        this.capacity = capacity *  4;
this.menu = generateMenu();
    }
    private List<String> generateMenu() {
        return Arrays.asList("Vesepecseye","Rántott velő","Pacal");
    }


    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
