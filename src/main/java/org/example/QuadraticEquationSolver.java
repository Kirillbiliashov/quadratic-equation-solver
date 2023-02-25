package org.example;

public class QuadraticEquationSolver {

  public static void solve(double a, double b, double c) {
    System.out.println("Equation is: (" + a + ") x^2 + (" + b + ") x + (" + c + ") = 0");
    double d = b * b - 4 * a * c;
    if (d < 0) {
      System.out.println("Equation has no roots");
    } else {
      double x1 = (-b + Math.sqrt(d)) / 2 * a;
      double x2 = (-b - Math.sqrt(d)) / 2 * a;
      if (x1 == x2) System.out.println("Equation has one root: " + x1);
      else System.out.println("The roots are " + x1 + " and " + x2);
    }
  }

}
