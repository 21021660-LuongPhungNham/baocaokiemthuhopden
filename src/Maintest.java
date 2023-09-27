import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {


    @Test
    public void testValidInput() {
        String result = Main.check(25, true, 0.07);
        assertEquals("Allowed", result);
    }

    @Test
    public void testValidInput() {
        String result = Main.check(35, true, 0.1);
        assertEquals("Not allowed", result);
    }

    @Test
    public void testValidInput() {
        String result = Main.check(30, false, 0.05);
        assertEquals("Not allowed", result);
    }

    @Test
    public void testValidInput() {
        String result = Main.check(22, false, 0.12);
        assertEquals("Not allowed", result);
    }

    @Test
    public void testInvalidAgeBelow18() {
        String result = Main.check(15, true, 0.06);
        assertEquals("Not allowed", result);
    }

    @Test
    public void testInvalidAgeAbove65() {
        String result = Main.check(70, true, 0.04);
        assertEquals("Not allowed", result);
    }

    @Test
    public void testInvalidAgeNegative() {
        String result = Main.check(-5, true, 0.08);
        assertEquals("Invalid", result);
    }
}