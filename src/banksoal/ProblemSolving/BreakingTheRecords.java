package banksoal.ProblemSolving;

import banksoal.BaseRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : BreakingTheRecords, v 0.1 2/17/22 9:42 PM Sogumontar Hendra Exp $$
 */
public class BreakingTheRecords extends BaseRequest {
    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int score = 0;
        int lowest = scores.get(0);
        int highest = scores.get(0);
        int resLow =0;
        int resHigh =0;

        for(int i=0 ; i<scores.size() ; i++ ){
            score = scores.get(i);
            if(score> highest){
                highest = scores.get(i);
                resHigh++;
            }else if(score <lowest){
                lowest = scores.get(i);
                resLow++;
            }
        }
        result.add(resHigh);
        result.add(resLow);
        return result;

    }

    public static void main(String[] args) {
        int inp = singleIntegerRequest();
        List<Integer> data = listOfIntegerRequest(inp);
        List<Integer> result =  breakingRecords(data);
        System.out.println(result);
    }

}

