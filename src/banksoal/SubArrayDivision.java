package banksoal;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : SubArrayDivision, v 0.1 2/2/22 3:14 PM Sogumontar Hendra Exp $$
 */
class  SubArrayDivision {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int result =0;
        if(m == 1){
            if(d == s.get(0)){
                return 1;
            }
        }
        for(int i=0 ; i<s.size()-(m-1) ; i++){
            int sumResult =0;
            for(int j=i ; j<m+i ; j++){
                sumResult += s.get(j);
            }
            System.out.println(sumResult);
            if(sumResult == d){
                result++;
            }
        }
        return result;

    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> s = new ArrayList<>();
        int a = sc.nextInt();
        for(int i=0 ; i<a ; i++){
            s.add(sc.nextInt());
        }
        int d = sc.nextInt();
        double aa = sc.nextDouble();
        int m = sc.nextInt();
        String inp = sc.next();
        int av = sc.nextInt();
        double b = sc.nextDouble();
        int result = SubArrayDivision.birthday(s, d, m);
        System.out.println(result);
    }
}
