package banksoal;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 3/3/2021.
 */
public class IsPalindrome extends BaseRequest{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String text= sc.nextLine();
      System.out.print(isPalindrome(text));
  }
  static String isPalindrome(String str)
  {
    str = str.toLowerCase();
    String text = str.replaceAll("\\s","").replaceAll("\\?", "").replaceAll(",","").replaceAll("!","").replace("'","").replaceAll("\"","");

    int i = 0, j = text.length() - 1;
    System.out.println(text);
    while (i < j) {
      if (text.charAt(i) != text.charAt(j))
        return "false";
      i++;
      j--;
    }
    return "true";
  }
}
