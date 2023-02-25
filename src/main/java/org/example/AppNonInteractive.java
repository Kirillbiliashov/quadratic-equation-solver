package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AppNonInteractive {

  public static void main(String[] args) {
    String fileName = args[0];
    try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
      String content = raf.readLine();
      String[] numsStr = content.split("\\s");
      if (numsStr.length != 3) throw new NumberFormatException();
      double a = Double.parseDouble(numsStr[0]);
      double b = Double.parseDouble(numsStr[1]);
      double c = Double.parseDouble(numsStr[2]);
      if (a == 0) throw new Exception("a cannot be 0");
      QuadraticEquationSolver.solve(a, b, c);
    } catch (IOException e) {
      System.out.println("file " + fileName + " does not exist");
      System.exit(1);
    } catch (NumberFormatException e) {
      System.out.println("Invalid file format");
      System.exit(1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.exit(1);
    }

  }
}
