package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        Collections.sort(ar);
        System.out.println(ar);
        int tempValue = 0;
        for(int i=0 ; i<n-1 ; i++){
            if(ar.get(i) == ar.get(i+1)){
                tempValue++;
                System.out.println(i + " " + tempValue + "  " + ar.get(i) + "  " + ar.get(i+1));
            }else{
                System.out.println(i + " " + tempValue + "  " + ar.get(i) + "  " + ar.get(i+1));
                if(tempValue>1){
                    result+= (tempValue/2);
                }
                tempValue=0;
            }
        }
        return result;
    }
}
