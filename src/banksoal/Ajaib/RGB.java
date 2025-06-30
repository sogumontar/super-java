/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2025 All Rights Reserved.
 */
package banksoal.Ajaib;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: RGB.java, v 0.1 2025‐01‐20 10.22
 */
public class RGB {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public String solution(int[] A) {
            // Implement your solution here
            int len = A.length;
            if(len == 0){
                return "impossible";
            }

            int tot = 1;
            for(int i: A){
                tot*=3;
            }

            for(int i = 0; i< tot ; i++){
                int totalR=0;
                int totalG=0;
                int totalB=0;
                String res = "";
                int c = i ;
                for(int j = 0 ; j<len ; j++){
                    int col =c%3;
                    c/=3;
                    if(col ==0 ){
                        totalR +=A[j];
                        res+="R";
                    }else if(col == 1){
                        totalG += A[j];
                        res+="G";
                    }else {
                        totalB +=A[j];
                        res+="B";
                    }
                }
                if(totalR == totalG  && totalG == totalB){
                    return res;
                }
            }
            return "impossible";
        }
    }

}
