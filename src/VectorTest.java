import org.junit.Assert;
import org.junit.Test;

public class VectorTest {
    @Test
    public void testAddition() {
        Assert.assertEquals(new Vector(6, 11, 19), new Vector(5, 9, 16).addition(new Vector(1, 2, 3)));
        Assert.assertEquals(new Vector(20, 2, -15), new Vector(16, -8, 0).addition(new Vector(4, 10, -15)));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(new Vector(-6, -13, 6), new Vector(6, 13, 0).subtract(new Vector(0, 0, 6)));
        Assert.assertEquals(new Vector(-7, -4, -1), new Vector(10, 4, 7).subtract(new Vector(3, 0, 6)));
    }

    @Test
    public void testDotProduct() {
        Assert.assertEquals(169, new Vector(3, -14, 10).dotProduct(new Vector(-3, -7, 8)));
        Assert.assertEquals(-108, new Vector(14, 10, 4).dotProduct(new Vector(-7, -7, 15)));
    }

    @Test
    public void testMultn() {
        Assert.assertEquals(new Vector(20, 8, 12), new Vector(10, 4, 6).multn(2));
        Assert.assertEquals(new Vector(42, 12, 21), new Vector(14, 4, 7).multn(3));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(new Vector(5, 2, 2), new Vector(10, 4, 4).division(2));
        Assert.assertEquals(new Vector(3, 1, 4), new Vector(6, 2, 8).division(2));
    }

    @Test
    public void testLength() {
        Assert.assertEquals(61, new Vector(3, 4, 6).length(new Vector(3, 4, 6)));
        Assert.assertEquals(254, new Vector(3, 14, 7).length(new Vector(3, 14, 7)));

    }

    @Test
    public void testVectormult() {
        Assert.assertEquals(new Vector(-35, 18, -8), Vector.vectormult(new Vector(4, 10, 5), new Vector(6, 13, 3)));
        Assert.assertEquals(new Vector(132, -30, 96), Vector.vectormult(new Vector(5, 6, -5), new Vector(-11, 6, 17)));

    }
}