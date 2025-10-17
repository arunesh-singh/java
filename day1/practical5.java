// Write a method that rotates a string by a given number without using any inbuilt method.

import java.util.*;
class practical5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: "); 
    String str = scanner.nextLine();

    System.out.print("Enter the number of positions to rotate: ");
    int positions = scanner.nextInt();

    positions = positions % str.length();

    String rotated = str.substring(str.length() - positions) + str.substring(0, str.length() - positions);
    System.out.println("Rotated string: " + rotated);
  }
}