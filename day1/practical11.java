// 11. Create a method that counts how many times a substring occurs in a given string without using any inbuilt method.

import java.util.Scanner;

class practical11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter the substring to find: ");
    String sub = scanner.nextLine();

    char[] nameChars = name.toCharArray();
    char[] subChars = sub.toCharArray();

    int nameLength = nameChars.length;
    int subLength = subChars.length;
    
    int count = 0;

    if (subLength > 0 && subLength <= nameLength) {
      for (int i = 0; i <= nameLength - subLength; i++) {
        boolean isMatch = true;

        for (int j = 0; j < subLength; j++) {
          if (nameChars[i + j] != subChars[j]) {
            isMatch = false;
            break;
          }
        }
        if (isMatch) {
          count++;
        }
      }
    }

    System.out.println("The substring '" + sub + "' occurs " + count + " times in the name.");
    
    scanner.close();
  }
}
