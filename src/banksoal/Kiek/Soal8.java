package banksoal.Kiek;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal8, v 0.1 2/21/22 3:58 PM Sogumontar Hendra Exp $$
 */
public class Soal8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value =1;
        String result="";
        for(int i=0 ; i<n ; i++){
            result = String.valueOf(value);
            if(i%2!=0){
                result = "-" + value;
            }
            System.out.println(result);
            value+=2;
        }
    }
}
