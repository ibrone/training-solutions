package immutable;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CelestialCoordinatesTest {

    @Test
    public void testToString() {
        assertThat(new CelestialCoordinates(12, 23, 45).toString(), equalTo("CelestialCoordinates: x=12, y=23, z=45"));
    }
}
