package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testPointTrue(){
    Point pa = new Point(2,3);
    Point pb = new Point (6,6);
    Assert.assertEquals (Point.distance(pa, pb), 5.0);
  }
  @Test
  public void testPointFalse1(){
    Point pa = new Point(2,3);
    Point pb = new Point (6,6);
    Assert.assertEquals (Point.distance(pa, pb), 6.0);
  }
  @Test
  public void testPointFalse2(){
    Point pa = new Point(2,3);
    Point pb = new Point (6,6);
    Assert.assertEquals (Point.distance(pa, pb), 32);
  }
}
