package ru.stqa.pft.sandbox;

import java.awt.*;

public class MyFirstProgram {


  public static void main(String[] args) {
    hello("world");
    double l = 12;
    System.out.println("Hello," + " TESTERS !");
    System.out.println("Площадь квадрата со стороной " + l + " = " + square(l));
    double a = 5;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " " + b + " = " + rec(a, b));
    Point pa = new Point(2, 3);
    Point pb = new Point(2, 3);
    System.out.println("Расстоняние между точками " + pa + " " + pb + " = " + distance(pa, pb));

  }


  public static void hello(String smb) {
    System.out.println("Hello, " + smb + "!");
  }

  public static double square(double l) {
    return l * l;
  }

  public static double rec(double a, double b) {
    return a * b;
  }

  public static double distance(Point p1, Point p2) {
    double x = p1.x - p2.x;
    double y = p1.y - p2.y;
    return Math.sqrt(x * x + y * y);
  }


}

