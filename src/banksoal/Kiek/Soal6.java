package banksoal.Kiek;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal6, v 0.1 2/21/22 3:39 PM Sogumontar Hendra Exp $$
 */
public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value =5;
        String result = "";
        int indikator=0;
        System.out.println(value);
        char[] alphabet = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        System.out.println("A");
        value+=5;
        int count =0;
        for(int i=0 ; i<n-1 ; i++){
            if(i%2==0){
                result = String.valueOf(value);
                if(indikator%2==0) {
                    result =  "-" + value;
                }
                System.out.println(result);
                value+=10;
                indikator++;
            }else{
                System.out.println(alphabet[count]);
                count++;
            }
        }
    }
}
