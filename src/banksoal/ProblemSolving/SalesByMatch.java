package banksoal.ProblemSolving;

import banksoal.BaseRequest;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : SalesByMatch, v 0.1 8/10/22 5:42 PM Sogumontar Hendra Exp $$
 */
public class SalesByMatch extends BaseRequest {
    public static void main(String[] args) {
        int val = singleIntegerRequest();
        List<Integer> list = listOfIntegerRequest(val);
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
