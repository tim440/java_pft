package ru.stqa.pft.sandbox;

public class Pointer {


  Pointer(double x, double y){
    this.x = x;
    this.y = y;
  }
  public double x;
  public double y;

  public static void main(String[] args) {

    Pointer pa = new Pointer(2, 3);
    Pointer pb = new Pointer(5, 3);
    System.out.println("Расстоняние между точками " + pa + " " + pb + " = " + distance(pa, pb));}

  public static double distance(Pointer p1, Pointer p2) {
    double x = p1.x - p2.x;
    double y = p1.y - p2.y;
    return Math.sqrt(x * x + y * y);
  }

}