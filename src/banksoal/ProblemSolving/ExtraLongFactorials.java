/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.math.BigInteger;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: ExtraLongFactorials.java, v 0.1 2024‐11‐11 21.43 dongsheng.hds Exp $$
 */
public class ExtraLongFactorials {
  public static void extraLongFactorials(int n) {
    // Write your code here
    BigInteger result = BigInteger.ONE; // Start with 1 as the initial factorial value

    for (int i = 2; i <= n; i++) {
      // Multiply result by i
    }
    while(n!=0){
      result = result.multiply(BigInteger.valueOf(n));
      n--;
    }
    System.out.println(result);

  }
}