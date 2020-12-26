package introjunit;





import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {


    public void byNormalName() {
        // Given
        String name = "John Doe";

        // When
        String greeting = new Gentleman().sayHello(name);

        // Then
        assertEquals("Hello John Doe", greeting);
    }

    private void assertEquals(String hello_john_doe, String greeting) {
    }


}
