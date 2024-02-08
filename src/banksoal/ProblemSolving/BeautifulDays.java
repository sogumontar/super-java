package banksoal.ProblemSolving;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : BeautifulDays, v 0.1 4/6/23 4:11 PM Sogumontar Hendra Exp $$
 */
public class BeautifulDays {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));

    }
    public static int beautifulDays(int i, int j, int k) {
        int result = 0;
        // Write your code here
        for(int a=i ; a<=j ; a++){
            String reverse = String.valueOf(a);

            StringBuilder output = new StringBuilder(reverse).reverse();
            reverse = output.toString();
            float rev = Math.abs(a-Integer.valueOf(reverse));
            float res =(rev/(float)k);

            if( !(res % 1 != 0 )){
                result ++;
            }

        }
        return result;
    }


}
