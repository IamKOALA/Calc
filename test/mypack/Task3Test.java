package mypack;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test {
    private final Calc instance = new Calc();

    @Test
    public void testCalc() {
        Assert.assertEquals(10 + 5, instance.add(15), 1e-7);
        Assert.assertEquals(20, instance.add(5), 1e-7);

        Assert.assertEquals(2, instance.div(10), 1e-7);

        Assert.assertEquals(26, instance.mult(13), 1e-7);
    }

    private final Interface inter = new Interface();

    @Test
    public void testInterface() {
        Assert.assertEquals(-1, inter.selectOption(10));
        Assert.assertEquals(-1, inter.selectOption(-13));
    }

}