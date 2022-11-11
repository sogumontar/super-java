package banksoal.ProblemSolving;

import banksoal.BaseRequest;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : ViralAdvertising, v 0.1 11/11/22 10:23 AM Sogumontar Hendra Exp $$
 */
public class ViralAdvertising extends BaseRequest {

    public static void main(String[] args) {
        System.out.println(viralAdvertising(singleIntegerRequest()));
    }

    public static int viralAdvertising(int n) {
        int person = 5;
        int liked=0;
        for(int i=0 ; i<n ; i++){
            liked += person/2;
            person = person/2*3;
            System.out.println(liked + " " + person);
        }
        return liked;

    }

}

