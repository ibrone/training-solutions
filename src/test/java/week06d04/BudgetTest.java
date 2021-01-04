package week06d04;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


class BudgetTest {

    private Budget budget = new Budget(Arrays.asList(
            new Item(1200,2020,11,12,"Pear"),
            new Item (1111,2020,12,11,"Apple"),
            new Item (111,2020,10,11,"Peach"),
            new Item(1111,2020,10,12,"Melon")));

    @Test
    public void getItemsByMonthTest
            List<Item> result = budget.getItemsByMonth(10);

     assertEquals(2,result.size());
assertEquals("Peach",result.get(0).getName;)
}
