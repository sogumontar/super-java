package banksoal.Kiek.HelpKiek;

import banksoal.BaseRequest;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal3, v 0.1 4/19/22 10:59 PM Sogumontar Hendra Exp $$
 */
public class Soal3 extends BaseRequest {
    public static void main(String[] args) {
        int N = singleIntegerRequest();
        String Nilai =singleStringRequest();
        System.out.println(solution(N,Nilai));

    }
    private static String solution(int N, String nilai){
        String result = "";
        String nilaiString= nilai.replace(".","");
        int digit = nilaiString.length();
        int interval = N - digit;
        if(interval-2 >=2){
            for(int i=0 ; i<interval-2 ; i++){
                result= result.concat("0");
            }
        }else if (interval-2 == 1){
            result = result.concat("00");
        }else{
            for (int i = 0; i < interval; i++) {
                result= result.concat("0");
            }
        }
        result= result.concat(nilaiString);
            if ((interval - 2) >= 2) {
                result = result.concat("00");
            } else {
                for (int i = 0; i < interval-2; i++) {
                    result = result.concat("0");
                }
            }

        return result;
    }
}
