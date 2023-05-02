package banksoal.ProblemSolving;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : test, v 0.1 4/13/23 2:05 PM Sogumontar Hendra Exp $$
 */
public class test {

    public static void main(String[] args) {
        System.out.println(sum(5));

    }
    private static int sum(int num){
        int result=0;
        for(int i=0 ; i<num ; i++){
            if(i==2)
                break;
            result+=i;
        }
        return result;
    }
}
