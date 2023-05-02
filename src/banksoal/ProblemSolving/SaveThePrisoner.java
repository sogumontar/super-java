package banksoal.ProblemSolving;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : SaveThePrisoner, v 0.1 5/1/23 11:18 PM Sogumontar Hendra Exp $$
 */
public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println("test" + saveThePrisoner(3,7,3));

    }
    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
//        int pos = s;
//        for(int i=0 ; i<m-1 ; i++){
//            System.out.println(pos);
//            if(pos < n){
//                pos++;
//            }else{
//                pos=1;
//            }
//        }
//        return pos;
return 1 + (s - 1 + m - 1) % n;
    }
}
