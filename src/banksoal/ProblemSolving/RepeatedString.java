/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.Arrays;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: RepeatedString.java, v 0.1 2024‐02‐08 17.28 dongsheng.hds Exp $$
 */
public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
    public static long repeatedString(String s, long n) {
        // Write your code here
        long result = 0;
        char[] charArray = s.toCharArray();

        long temp = n/s.length();
        for( char str : charArray ){
            if(str == 'a'){
                result ++;
            }else if(result>0){
                break;
            }
        }
        result*=temp;
        long mod = n%s.length();
        if(mod != 0){

            for(int i=0;i<mod;i++){
                if(charArray[i] == 'a'){
                    result++;
                }
            }
        }
        return result;

    }
}