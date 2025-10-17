// Create a method that merges to sorted array into a single sorted array without using any inbuilt method.

import java.util.*;
class practical4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Enter the size of first array: ");
    int size1 = scanner.nextInt();
    int[] arr1 = new int[size1];
    System.out.println("Enter the elements of first array: ");
    for (int i = 0; i < size1; i++) { 
      arr1[i] = scanner.nextInt();
    } 
    System.out.print("Enter the size of second array: ");
    int size2 = scanner.nextInt();
    int[] arr2 = new int[size2];
    System.out.println("Enter the elements of second array: ");
    for (int i = 0; i < size2; i++) { 
      arr2[i] = scanner.nextInt();
    }
    int[] mergedArray = new int[size1 + size2];
    int i = 0, j = 0, k = 0;
    while (i < size1 && j < size2) {  
      if (arr1[i] <= arr2[j]) { 
        mergedArray[k++] = arr1[i++]; 
      } else { 
        mergedArray[k++] = arr2[j++]; 
      } 
    }
    while (i < size1) { 
      mergedArray[k++] = arr1[i++]; 
    }
    while (j < size2) {
      mergedArray[k++] = arr2[j++]; 
    }
    System.out.println("Merged sorted array: ");
    for (i = 0; i < mergedArray.length; i++) {
      System.out.print(mergedArray[i] + " ");
    }
    scanner.close();
  }
}