package banksoal.Kiek;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal7, v 0.1 2/21/22 3:56 PM Sogumontar Hendra Exp $$
 */
public class Soal7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value =1;
        for(int i=0 ; i<n ; i++){
            System.out.println(value);
            value+=2;
        }
    }
}
