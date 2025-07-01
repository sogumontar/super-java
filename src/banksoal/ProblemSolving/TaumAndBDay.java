/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2025 All Rights Reserved.
 */
package banksoal.ProblemSolving;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: TaumAndBDay.java, v 0.1 2025‐07‐01 22.17
 */
public class TaumAndBDay {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long blackTotalCost = (long)b*bc;
        long whiteTotalCost = (long)w*wc;
        if (wc > bc+z){
            whiteTotalCost = (long)w*(bc+z);
        }else if(bc > wc+z){
            blackTotalCost = (long)b*(wc+z);
        }
        return blackTotalCost + whiteTotalCost;
    }
    public static void main(String[] args) {
        int b = 3; // number of black gifts
        int w = 5; // number of white gifts
        int bc = 3; // cost of a black gift
        int wc = 4; // cost of a white gift
        int z = 1; // cost to convert one gift to another

        long totalCost = taumBday(b, w, bc, wc, z);
        System.out.println("Total cost: " + totalCost); // Output: Total cost: 29
    }
}
