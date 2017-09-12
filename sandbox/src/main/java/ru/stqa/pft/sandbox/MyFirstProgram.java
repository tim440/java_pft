package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    Square s = new Square(12);

    System.out.println("Hello," + " TESTERS !");
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.square());
    Rectangle r = new Rectangle(5, 6);

    System.out.println("Площадь прямоугольника со сторонами " + r.a + " " + r.b + " = " + r.rec());
    Pointer pa = new Pointer(2, 3);
    Pointer pb = new Pointer(6, 6);
    System.out.println("Расстоняние между точками " + pa + " " + pb + " = " + Pointer.distance(pa,pb));
  }

  public static void hello(String smb) {
    System.out.println("Hello, " + smb + "!");
  }

}

