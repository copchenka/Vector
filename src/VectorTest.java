import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class VectorTest {
    @Test
    public void testAddition() {
        assertEquals(new Vector(6, 11, 19), new Vector(5, 9, 16).addition(new Vector(1, 2, 3)));
        assertEquals(new Vector(20, 2, -15), new Vector(16, -8, 0).addition(new Vector(4, 10, -15)));
        assertEquals(new Vector(98, 9, 18), new Vector(0, 0, 0).addition(new Vector(98, 9, 18)));
        assertEquals(new Vector(0, 0, 0), new Vector(0, 0, 0).addition(new Vector(0, 0, 0)));
        try {
            assertEquals(null, new Vector(-5, 0).addition(new Vector(7, 9, 6)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSubtract() {
        assertEquals(new Vector(-6, -13, 6), new Vector(6, 13, 0).subtract(new Vector(0, 0, 6)));
        assertEquals(new Vector(-7, -4, -1), new Vector(10, 4, 7).subtract(new Vector(3, 0, 6)));
        assertEquals(new Vector(1, 2, 3), new Vector(0, 0, 0).subtract(new Vector(1, 2, 3)));
        assertEquals(new Vector(0, 0, 0), new Vector(0, 0, 0).subtract(new Vector(0, 0, 0)));
        //  assertEquals( new Exception(), new Vector( -5, 0).subtract(new Vector(7, 9, 6)));
        try {
            assertEquals(null, new Vector(-5, 0).subtract(new Vector(7, 9, 6)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDotProduct() {
        assertEquals(169, new Vector(3, -14, 10).dotProduct(new Vector(-3, -7, 8)));
        assertEquals(-108, new Vector(14, 10, 4).dotProduct(new Vector(-7, -7, 15)));
        assertEquals(0, new Vector(3, 4, 6).dotProduct(new Vector(0, 0, 0)));
        assertEquals(0, new Vector(0, 0, 0).dotProduct(new Vector(3, 14, 7)));
        try {
            assertEquals(null, new Vector(-5, 0).dotProduct(new Vector(7, 9, 6)));
        } catch (Exception e) {
            ;
        }
    }

    @Test
    public void testMultn() {
        assertEquals(new Vector(20, 8, 12), new Vector(10, 4, 6).multn(2));
        assertEquals(new Vector(42, 12, 21), new Vector(14, 4, 7).multn(3));
        assertEquals(new Vector(0, 0, 0), new Vector(5, 9, 16).multn(0));
        assertEquals(new Vector(0, 0, 0), new Vector(0, 0, 0).multn(78));
        assertEquals(new Vector(-12, 15, -21), new Vector(4, -5, 7).multn(-3));
    }

    @Test
    public void testDivision() {
        assertEquals(new Vector(5, 2, 2), new Vector(10, 4, 4).division(2));
        assertEquals(new Vector(3, 1, 4), new Vector(6, 2, 8).division(2));
        assertEquals(new Vector(1, 3, 5), new Vector(5, 9, 16).division(3));
        assertEquals(new Vector(-16, 8), new Vector(16, -8).division(-1));
        assertEquals(new Vector(0, 0, 0), new Vector(0, 0, 0).division(7));
        try {
            assertEquals(null, new Vector(-5, 0).division(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLength() {
        assertEquals(7, new Vector(3, 4, 6).length(new Vector(3, 4, 6)));
        assertEquals(15, new Vector(3, 14, 7).length(new Vector(3, 14, 7)));
        assertEquals(0, new Vector(0, 0, 0).length(new Vector(0, 0, 0)));
        assertEquals(5, new Vector(3, 4).length(new Vector(3, 4)));
    }

    @Test
    public void testVectormult() throws FileNotFoundException {
        assertEquals(new Vector(-35, 18, -8), Vector.vectormult(new Vector(4, 10, 5), new Vector(6, 13, 3)));
        assertEquals(new Vector(132, -30, 96), Vector.vectormult(new Vector(5, 6, -5), new Vector(-11, 6, 17)));
        assertEquals(new Vector(0, 0, 0), Vector.vectormult(new Vector(0, 0, 0), new Vector(6, 13, 3)));
        assertEquals(new Vector(0, 0, 0), Vector.vectormult(new Vector(3, 10, 14), new Vector(0, 0, 0)));
        try {
            assertEquals(null, Vector.vectormult(new Vector(-5, 0), new Vector(7, 9, 6)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}