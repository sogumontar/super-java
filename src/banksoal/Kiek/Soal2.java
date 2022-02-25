package banksoal.Kiek;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal2, v 0.1 2/25/22 3:39 PM Sogumontar Hendra Exp $$
 */
public class Soal2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int deret=3;
    int value =2;
    for(int i=0 ; i<=n ; i++){
        System.out.println(value);
        value-=deret;
        deret+=3;
    }
}

}
