package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget (List<Item> items){
        this.items = items;
    }

    public List<Item> getItemsByMonth(int montNumber){
        List<Item> result = new ArrayList<>() ;
    for (Item item : items){
        if (item.getDate().getMonthValue() == montNumber){
            result.add(item);
        }
    }
    return result;
    }
    public List<Item>getItems(){
        return items;
    }
}
