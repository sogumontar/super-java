/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.Grab;

import java.util.Arrays;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: demo.java, v 0.1 2024‐11‐12 21.18 dongsheng.hds Exp $$
 */
public class demo {
    public static void main(String[] args) {
        int[] numbers = {-1,-3};
        System.out.println(solution(numbers));

    }
    public static int solution(int[] A){
        Arrays.sort(A);
        if(A[0] >1){
            return 1;
        }
        for(int i =0 ; i<A.length-1 ; i++){
            int val = A[i+1]-A[i];
            if(A[i]>0 && val>1){
                return A[i]+1;
            }
        }
        int result = A[A.length-1]+1;
        return result <= 0 ? 1: result;

    }
}