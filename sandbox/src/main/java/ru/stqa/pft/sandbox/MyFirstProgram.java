package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    Square s = new Square(12);

    System.out.println("Hello," + " TESTERS !");
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + square(s));
    Rectangle r = new Rectangle(5, 6);

    System.out.println("Площадь прямоугольника со сторонами " + r.a + " " + r.b + " = " + rec(r));
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


}

