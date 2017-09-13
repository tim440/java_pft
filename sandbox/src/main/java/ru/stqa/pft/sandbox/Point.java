package ru.stqa.pft.sandbox;

public class Point {


  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double x;
  public double y;


  public static double distance(Point p1, Point p2) {
    double x = p1.x - p2.x;
    double y = p1.y - p2.y;
    return Math.sqrt(x * x + y * y);
  }

  @Override
  public String toString() {
    return "Point{" +
            "x=" + x +
            ", y=" + y +
            '}';
  }
}