package banksoal.ProblemSolving;

import banksoal.BaseRequest;

import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : DivisibleSumPairs, v 0.1 9/12/22 5:57 PM Sogumontar Hendra Exp $$
 */
public class DivisibleSumPairs extends BaseRequest {
    public static void main(String[] args) {
        int n = singleIntegerRequest();
        int k = singleIntegerRequest();
        List<Integer> list = listOfIntegerRequest(n);
        System.out.println(divisibleSumPairs(n,k, list));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int result =0;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if((ar.get(i)+ ar.get(j))% k ==0){
                    result++;
                }
            }
        }

        return result;

    }

}
