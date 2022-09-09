package banksoal;

/**
 * Created by Sogumontar Hendra Simangunsong on 3/3/2021.
 */
public class IsPalindrome extends BaseRequest{
  public static void main(String[] args) {
      System.out.print(isPalindrome(singleStringRequest()));
  }
  static String isPalindrome(String str)
  {

    int i = 0, j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j))
        return "false";
      i++;
      j--;
    }
    return "true";
  }
}
