package banksoal.ProblemSolving;

import banksoal.BaseRequest;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : CountingValleys, v 0.1 2/25/22 10:44 AM Sogumontar Hendra Exp $$
 */
public class CountingValleys extends BaseRequest {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys=0;
        int pos=0;
        int ind=0;
        for(int i=0; i<steps ; i++){
            if(path.charAt(i) == 'U'){
                pos++;
            }else{
                pos--;
            }
            if(ind == 0 && pos<0 ){
                ind=1;
                valleys++;
            }
            if(ind ==1 && pos>=0){
                ind=0;
            }

            System.out.println(i + "   " + valleys );
        }
         return valleys;

    }

    public static void main(String[] args) {
        int inp = singleIntegerRequest();
        String path = singleStringRequest();
        System.out.println(countingValleys(inp,path));

    }
}
