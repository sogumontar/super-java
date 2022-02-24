package banksoal.ProblemSolving;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : CatAndMouse, v 0.1 2/24/22 9:45 AM Sogumontar Hendra Exp $$
 */
public class CatAndMouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(catAndMouse(x,y,z));
    }
    static String catAndMouse(int x, int y, int z) {
        String result = "Cat A";
        int catB = Math.abs(y-z);
        int catA = Math.abs(z-x);
        if( catA == catB){
            result = "Mouse C";
        }else{
            if(catA > catB){
                result = "Cat B";
            }
        }

        return result;

    }
}
