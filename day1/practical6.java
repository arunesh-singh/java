import java.util.*;

class practical6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    char[] strArr = str.toCharArray();
    boolean isPallindrome = true;

    for(int i=0; i< strArr.length / 2  ; i++ ){
      if (strArr[i] != strArr[strArr.length - 1 - i]){
        isPallindrome = false;
        break;
      }
    }

    if(isPallindrome){
      System.out.println("The string is Palindrome");
    }else {
      System.out.println("The string is not Palindrome");
    }
  }
}