import java.util.*;

class practical7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = scanner.nextLine();

    int vovels = 0, consonants =0;

    char[] strArr = str.toCharArray();

    for(int i=0; i< strArr.length ; i++ ){
      if(strArr[i] == 'a' || strArr[i] == 'e' || strArr[i] == 'i' || strArr[i] == 'o' || strArr[i] == 'u'){
        vovels++;
      }else {
        consonants++;
      }
    }

    System.out.println("The string "+ str + " contains " + vovels + " vovels and " + consonants + " consonants.");
  }
}