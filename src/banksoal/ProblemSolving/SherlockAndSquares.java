/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.ProblemSolving;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: SherlockAndSquares.java, v 0.1 2024‐11‐11 21.36 dongsheng.hds Exp $$
 */
public class SherlockAndSquares {

    public static int squares(int a, int b) {

        int minSquareRoot = (int) Math.ceil(Math.sqrt(a));

        int maxSquareRoot = (int) Math.floor(Math.sqrt(b));

        return maxSquareRoot - minSquareRoot + 1;

    }
}