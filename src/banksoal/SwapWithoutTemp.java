package banksoal;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/17/2021.
 */

public class SwapWithoutTemp {
  public static void main(String[] args) {
    int a = 2;
    int b = 9;

    a = a+b;
    b = a-b;
    a = a-b;

    System.out.println(a);
    System.out.println(b);
  }

}
