package pets;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate birth;
    private String gender;
    private String regNumb;

    public Pet (String name, LocalDate birth, String gender, String regNumb){
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.regNumb = regNumb;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getGender() {
        return gender;
    }

    public String getRegNumb() {
        return regNumb;
    }
}
