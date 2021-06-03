package vladiknt.Core;

import org.junit.Test;
import org.junit.Assert;

public class MainTest {

    @Test
    public void simpleOperations() {
        String expr = "2+2/2-10*(30-10)";
        Assert.assertEquals("-197", Main.func(expr));
    }

    @Test
    public void singleNumber() {
        String expr = "0";
        Assert.assertEquals("0", Main.func(expr));
    }

    @Test
    public void mathPow() {
        String expr = "2^2";
        Assert.assertEquals("4", Main.func(expr));
        expr = "9^(0.5)";
        Assert.assertEquals("3", Main.func(expr));
    }

    @Test
    public void doubleValue() {
        String expr = "0.2*7";
        Assert.assertEquals("1.4", Main.func(expr));
    }

    @Test
    public void incorrectExpr() {
        String expr = "abc";
        Assert.assertEquals("error", Main.func(expr));
        expr = "+";
        Assert.assertEquals("error", Main.func(expr));
    }

    @Test
    public void veryBigValue() {
        String expr = "10000000000000*10000000000000";
        Assert.assertEquals("very much", Main.func(expr));
    }

    @Test
    public void manyDots() {
        String expr = "3.1.";
        Assert.assertEquals("error", Main.func(expr));
        expr = ".....";
        Assert.assertEquals("error", Main.func(expr));
    }

    @Test
    public void divByZero() {
        String expr = "0/0";
        Assert.assertEquals("error", Main.func(expr));
    }

}