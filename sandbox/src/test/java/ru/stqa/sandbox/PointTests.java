package ru.stqa.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testPoint1(){
        Point p1 = new Point (1, 2);
        Point p2 = new Point (2, 3);
        Assert.assertEquals(p1.distance(p2), 1.4142135623730951);
    }

    @Test
    public void testPoint2(){
        Point p1 = new Point (2, 100);
        Point p2 = new Point (3, 40);
        Assert.assertEquals(p1.distance(p2), 60.00833275470999);
    }
}
