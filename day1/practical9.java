// Create a method that returns the first non-repeated character in a given string without using any inbuilt method.

import java.util.Scanner;
class practical9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String name = scanner.nextLine();

    char[] nameChars = name.toCharArray();
    int nameLength = nameChars.length;

    char firstNonRepeatedChar = '\0';

    for (int i = 0; i < nameLength; i++) {
      boolean isRepeated = false;

      for (int j = 0; j < nameLength; j++) {
        if (i != j && nameChars[i] == nameChars[j]) {
          isRepeated = true;
          break;
        }
      }

      if (!isRepeated) {
        firstNonRepeatedChar = nameChars[i];
        break;
      }
    }

    if (firstNonRepeatedChar != '\0') {
      System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
    } else {
      System.out.println("All characters are repeated.");
    }

    scanner.close();
  }
}