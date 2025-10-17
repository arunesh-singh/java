import java.util.*;

class practical2 {
  public static int[] findMinMax(int[] arr) {
    if (arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array cannot be null or empty");
    }
    
    int min = arr[0];
    int max = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    
    return new int[]{min, max};
  }
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
      int n = scanner.nextInt();
      
      int[] numbers = new int[n];
      
      System.out.println("Enter " + n + " integers:");
      for (int i = 0; i < n; i++) {
          numbers[i] = scanner.nextInt();
      }
      
      int[] result = findMinMax(numbers);
      
      System.out.println("Minimum value: " + result[0]);
      System.out.println("Maximum value: " + result[1]);
    }
}
