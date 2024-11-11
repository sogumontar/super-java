/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.Arrays;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: JumpingOnCloud.java, v 0.1 2024‐11‐05 23.09 dongsheng.hds Exp $$
 */
public class JumpingOnCloud {
    public static void main(String[] args) {
        int[] numbers = {0,0,1,0,0,1,1,0};
        System.out.println(jumpingOnClouds(numbers, 2));
    }
    static int jumpingOnClouds(int[] c, int k) {
        int result = 100;
        int pos =k;
        while(pos != 0){
            result-=1;
            if(c[pos] == 1){
                result-=2;
            }
            pos= (pos+k)%c.length;
        }

        return c[pos] ==1 ? result-3 : result-1;
    }
}