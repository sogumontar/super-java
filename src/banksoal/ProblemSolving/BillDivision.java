package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : BillDivision, v 0.1 3/8/22 9:55 AM Sogumontar Hendra Exp $$
 */
public class BillDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int k =sc.nextInt();
        int j =sc.nextInt();
        for(int i=0 ; i<k ; i++){
            list.add(sc.nextInt());
        }
        int b= sc.nextInt();
        bonAppetit(list,k,b);
    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        String result = "Bon Appetit";
        int shared = 0;
        for(int i=0 ; i<bill.size() ; i++){
            if(i!=k){
                shared+=bill.get(i);
            }
        }
        if(b>(shared/2)){
            result = String.valueOf(b-(shared/2));
        }
        System.out.println(result);

    }
}
