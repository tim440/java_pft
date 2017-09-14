package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testPoint(){
    Point pa = new Point(2,3);
    Point pb = new Point (6,6);
    Assert.assertEquals (Point.distance(pa, pb), 5.0);
  }
}
