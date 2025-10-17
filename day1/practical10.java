// Write a method that checks whether two strings are anagrams of each other without using any inbuilt method.

import java.util.Scanner;
class practicall10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String str1 = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String str2 = scanner.nextLine();

    char[] str1Chars = str1.toCharArray();
    char[] str2Chars = str2.toCharArray();

    int str1Length = str1Chars.length;
    int str2Length = str2Chars.length;

    if (str1Length != str2Length) {
      System.out.println("The strings are not anagrams.");
      scanner.close();
      return;
    }

    for (int i = 0; i < str1Length - 1; i++) {
      for (int j = 0; j < str1Length - i - 1; j++) {
        if (str1Chars[j] > str1Chars[j + 1]) {
          char temp = str1Chars[j];
          str1Chars[j] = str1Chars[j + 1];
          str1Chars[j + 1] = temp;
        }
        if (str2Chars[j] > str2Chars[j + 1]) {
          char temp = str2Chars[j];
          str2Chars[j] = str2Chars[j + 1];
          str2Chars[j + 1] = temp;
        }
      }
    }

    boolean areAnagrams = true;
    for (int i = 0; i < str1Length; i++) {
      if (str1Chars[i] != str2Chars[i]) {
        areAnagrams = false;
        break;
      }
    }

    if (areAnagrams) {
      System.out.println("The strings are anagrams.");
    } else {
      System.out.println("The strings are not anagrams.");
    }

    scanner.close();
  }
}