package banksoal.Kiek.HelpKiek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal1, v 0.1 4/19/22 10:43 PM Sogumontar Hendra Exp $$
 */
public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    private static List<Float> solution(int n){
        List<Float> result =new ArrayList<>();
        float value=n;
        for(int i=0 ; i<n ; i++){
            result.add(value);
            value/=2;
        }
        return result;
    }
}
