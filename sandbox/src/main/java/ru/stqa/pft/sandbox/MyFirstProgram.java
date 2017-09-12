package ru.stqa.pft.sandbox;

public class MyFirstProgram {


  public static void main(String[] args) {
    hello("world");
    Square s = new Square();
    s.l = 12;
    System.out.println("Hello," + " TESTERS !");
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + square(s));
    Rectangle r = new Rectangle();
    r.a = 5;
    r.b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " " + r.b + " = " + rec(r));
    Pointer pa = new Pointer(2, 3);
    Pointer pb = new Pointer(2, 3);
    System.out.println("Расстоняние между точками " + pa + " " + pb + " = " + distance(pa, pb));

  }


  public static void hello(String smb) {
    System.out.println("Hello, " + smb + "!");
  }

  public static double square(Square s) {
    return s.l * s.l;
  }

  public static double rec(Rectangle r) {
    return r.a * r.b;
  }

  public static double distance(Pointer p1, Pointer p2) {
    double x = p1.x - p2.x;
    double y = p1.y - p2.y;
    return Math.sqrt(x * x + y * y);
  }


}

