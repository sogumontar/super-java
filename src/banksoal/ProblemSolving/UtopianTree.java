package banksoal.ProblemSolving;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : UtopianTree, v 0.1 4/4/23 10:10 AM Sogumontar Hendra Exp $$
 */
public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(4));

    }
    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
        // Write your code here
        int result =0;
        for(int i=0 ; i<=n ; i++){
            if(i%2 == 0){
                result += 1;
            }else{
                result*=2;
            }
        }
        return result;

    }
}
