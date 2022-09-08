package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : SalesByMatch, v 0.1 8/10/22 5:42 PM Sogumontar Hendra Exp $$
 */
public class SalesByMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<val ; i++){
            list.add(sc.nextInt());
        }
        System.out.println(sockMerchant(val,list));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int result =0;
        List<Integer> distinct = ar.stream().distinct().collect(Collectors.toList());

        for(int i=0 ; i<distinct.size() ; i++){
            int count = Collections.frequency(ar,distinct.get(i));
            if(count>1) {
                result += (count/2);
            }
        }
        return result;
    }
}
