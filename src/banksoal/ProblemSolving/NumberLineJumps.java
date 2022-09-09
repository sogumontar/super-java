package banksoal.ProblemSolving;

import banksoal.BaseRequest;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : NumberLineJumps, v 0.1 2/12/22 4:15 PM Sogumontar Hendra Exp $$
 */
public class NumberLineJumps extends BaseRequest {
    public static void main(String[] args) {
        List<Integer> list = listOfIntegerRequest(4);
        System.out.println(kangaroo(list.get(0),list.get(1),list.get(2),list.get(3)));

    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int vdiff = v1 - v2;
        if (vdiff <= 0) {
            return "NO";
        }else{
            int xdiff = x1 - x2;
            return (xdiff % vdiff == 0 ? "YES" : "NO");
        }
    }
}
