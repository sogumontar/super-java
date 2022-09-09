package banksoal.ProblemSolving;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : DrawingBook, v 0.1 2/23/22 3:22 PM Sogumontar Hendra Exp $$
 */

import banksoal.BaseRequest;

public class DrawingBook extends BaseRequest {
    public static void main(String[] args) {
        int n = singleIntegerRequest();
        int p = singleIntegerRequest();
        System.out.println(pageCount(n,p));

    }
    public static int pageCount(int n, int p) {
        // Write your code here
        int result =0;
        if(n%2!=0){
            n--;
        }
        if(p%2!=0){
            p--;
        }
        if((n-p)>p){

            result =p/2;
        }else{
            if(n-p ==1){
                return 1;
            }
            result = (n-p)/2;
        }

        return result;
    }
}
