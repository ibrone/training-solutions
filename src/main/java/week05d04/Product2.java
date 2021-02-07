package week05d04;

import java.time.LocalDate;

public class Product2 {

    private String name;
    private LocalDate expiringtime;

    public Product2(String name, int year, int month, int day) {
        this.name = name;
        this.expiringtime= LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiringtime() {
        return expiringtime;
    }

    public boolean isExpired(){
        if (expiringtime.isBefore(LocalDate.now())){
        return true;
        }return false;
    }
}

