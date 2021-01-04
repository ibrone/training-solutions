package week06d04;
import java.time.LocalDate;

public class Item {
    private int price;
    private LocalDate date;
    private String name;

    public Item(int price,int year,int month, int day,String name){
        if (price < 0){
            throw new IllegalArgumentException("Wrong price");
        }
        this.price = price;
        this.name= name;
        date = LocalDate.of(year,month,day);
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
