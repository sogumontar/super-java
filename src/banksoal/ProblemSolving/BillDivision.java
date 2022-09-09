package banksoal.ProblemSolving;

import banksoal.BaseRequest;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : BillDivision, v 0.1 3/8/22 9:55 AM Sogumontar Hendra Exp $$
 */
public class BillDivision extends BaseRequest {
    public static void main(String[] args) {
        int k = singleIntegerRequest();
        List<Integer> list = listOfIntegerRequest(k);
        int b= singleIntegerRequest();
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
