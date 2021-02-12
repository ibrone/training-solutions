package week07d04;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    public void createWithTitle(){
        Lab lab = new Lab ("Task");
        assertEquals("Taksk1", lab.getTitle());
        assertFalse(lab.isCompleted());
    }

    @Test
    public void createWithTitleAndDate (){
        Lab lab = new Lab("Task1", LocalDateTime.of(2020,12,9,10,0));
        assertEquals("Task1", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDateTime.of(2020, 12,9,10,0), lab.getCompletedAt());
    }

    @Test
    public void completeNowTest(){
        Lab lab = new Lab ("Task1");
        lab.complete();
        assertTrue(lab.isCompleted());
        assertEquals(LocalDateTime.now(), lab.getCompletedAt());
    }
}
