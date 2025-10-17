  // write a method that checks if there are any duplicate element in an integer array. return true if duplicate exists else return false without using any inbuilt method.

import java.util.*;
class practical3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    } 
    boolean hasDuplicate = false;
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] == arr[j]) {
          hasDuplicate = true;
          break;
        }
      }
      if (hasDuplicate) {
        break;
      }
    }
    if (hasDuplicate) {
      System.out.println("The array contains duplicate elements.");
    } else {
      System.out.println("The array does not contain duplicate elements.");
    }
    scanner.close();
  }
}