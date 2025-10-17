// write a method that takes an integer array as input and returns a new array with the elements in reverse order without using any inbuilt method.

import java.util.*;
class practical1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {  
      arr[i] = scanner.nextInt();
    }
    int[] reversedArr = new int[size];
    for (int i = 0; i < size; i++) {
      reversedArr[i] = arr[size - 1 - i];
    }
    System.out.println("Reversed array: ");
    for (int i = 0; i < size; i++) {
      System.out.print(reversedArr[i] + " ");
    }
    scanner.close();
  }
}