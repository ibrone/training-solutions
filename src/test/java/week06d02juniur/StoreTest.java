package week06d02juniur;

import org.junit.Test;
import week06d02junior.Category;
import week06d02junior.Product;
import week06d02junior.Store;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void getProductsbyCategoryNameTest(){
        Store store = new Store(Arrays.asList(
                new Product("Kifli", Category.BAKEDGOODS,20),
                new Product("Zsemle", Category.BAKEDGOODS,25),
                new Product("Tej", Category.DAIRY, 199),
                new Product("Joghurt",Category.DAIRY,150)
        ));
    assertEquals(2,store.getProductByCategoryName(Category.BAKEDGOODS));
    assertEquals(1,store.getProductByCategoryName(Category.HOUSEKEPPING));

    }

}