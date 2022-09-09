package banksoal;

import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : LCM_2, v 0.1 2/12/22 4:14 PM Sogumontar Hendra Exp $$
 */
public class LCM_2 extends BaseRequest{
    public static void main(String[] args) {
        List<Integer> requests = listOfIntegerRequest(2);
        System.out.println(lcm(requests.get(0),requests.get(1)));
    }
    public static int lcm(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }
}
