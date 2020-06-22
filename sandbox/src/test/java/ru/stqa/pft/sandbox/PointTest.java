package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.Point.distance;


public class PointTest {

  @Test


  public void testPoint1() {

    Point p1 = new Point(0, 0);
    Point p2 = new Point(1, 0);
    Assert.assertEquals(distance(p1, p2), 1);
  }

  @Test

  public void testPoint2() {

    Point p1 = new Point(0, 0);
    Point p2 = new Point(10, 10);
    Assert.assertEquals(distance(p1, p2), 14.142135623730951);
  }


}
