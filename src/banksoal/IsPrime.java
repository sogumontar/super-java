package banksoal;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/23/2021.
 */
public class IsPrime extends BaseRequest{
  static boolean isPrime(int n, int i)
  {
    if (n <= 2)
      return (n == 2) ? true : false;
    if (n % i == 0)
      return false;
    if (i * i > n)
      return true;

    return isPrime(n, i + 1);
  }

  static int smallestDivisor(int n)
  {
    if (n % 2 == 0)
      return 2;

    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0)
        return i;
    }

    return n;
  }

  public static void main(String[] args)
  {

    int n = singleIntegerRequest();

    if (isPrime(n, 2))
      System.out.println(1);
    else
      System.out.println(smallestDivisor(n));
  }
}
