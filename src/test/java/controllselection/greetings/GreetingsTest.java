package controllselection.greetings;

import controlselection.greetings.Greetings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

@Test
    public void testsayGreeting(){
    Greetings greetings = new Greetings();

    assertEquals("Good Night",greetings.sayGreeting(3,30));
assertEquals("Good Night", greetings.sayGreeting(4,43));

}




}
