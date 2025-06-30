/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2025 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.Arrays;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: Greather.java, v 0.1 2025‐01‐20 09.42
 */
public class Greather {
    public static int solution(int[] A) {
        int res= 1;
        // Implement your solution here
        for(int i : A){
            if(i == res){
                res++;
            }else if(i> res){
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] var ={1,3,6,4,1,2};
        System.out.println(solution(var));
    }
}
