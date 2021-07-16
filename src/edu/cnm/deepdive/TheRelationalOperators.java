package edu.cnm.deepdive;

public class TheRelationalOperators {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = 10;

    System.out.println("x < y is " + (x < y));
    System.out.println("x <= y is " + (x <= y));
    System.out.println("x >= z is " + (x >= z));
    System.out.println("y <= z is " + (y <= z));

    int a = 10;
    long b = 5L;
    double c = 7.5;
    System.out.println("a < b is " + (a < b));// a will be promoted to long
    System.out.println("a > c is " + (a > c));// a will be promoted to double

    int d = 12;
    long e = 15L;
    double f = 14.5;
    System.out.println((d < e) + " " + (e < f));//gives true false
  }

}
