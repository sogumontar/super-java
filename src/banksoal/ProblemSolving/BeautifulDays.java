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

        int result =0;
        for(int a= i ; a<= j ; a++){
            String num = String.valueOf(a);
            num = reverse(num);
            int reverseNum = Integer.parseInt(num);
            double res=(a-reverseNum)/k;
            if(res%1 !=0){

            }else{
                result++;
            }
        }

        return result;
        // Write your code here

    }
    public static String reverse(String originalStr){
        String reversedStr="";
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        return reversedStr;
    }

}
