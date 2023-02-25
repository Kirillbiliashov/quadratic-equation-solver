package org.example;

import java.util.Scanner;

public class AppInteractive {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a = getNumber("a");
        double b = getNumber("b");
        double c = getNumber("c");
        QuadraticEquationSolver.solve(a, b, c);
    }

    private static double getNumber(String paramName) {
        boolean zeroCheckRequired = paramName.equals("a");
        double num;
        String numStr = null;
        while (true) {
            try {
                System.out.print(paramName + " = ");
                numStr = scanner.nextLine();
                num = Double.parseDouble(numStr);
                if (zeroCheckRequired && num == 0) throw new NumberFormatException();
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Error. Expected " +  paramName +
                    " valid real number, got " + numStr + " instead");
            }
        }
    }

}
