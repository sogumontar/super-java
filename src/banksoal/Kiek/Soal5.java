package banksoal.Kiek;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal5, v 0.1 2/21/22 3:36 PM Sogumontar Hendra Exp $$
 */
public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value =5;
        System.out.println(value);
        System.out.println("A");
        value+=5;
        for(int i=0 ; i<n-1 ; i++){
            if(i%2==0){
                System.out.println(value);
                value+=10;
            }else{
                System.out.println("A");
            }
        }
    }
}
