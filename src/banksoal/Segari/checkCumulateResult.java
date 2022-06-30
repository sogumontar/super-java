package banksoal.Segari;

import java.util.*;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : checkCumulateResult, v 0.1 6/30/22 4:13 PM Sogumontar Hendra Exp $$
 */
public class checkCumulateResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> data1 = new ArrayList<>();
        List<Integer> data2 = new ArrayList<>();
        int num1 = sc.nextInt();

        for(int i=0 ; i<num1 ; i++){
            data1.add(sc.nextInt());
        }

        int num2 = sc.nextInt();

        Collections.sort(data1);

        for(int i=0 ; i<num2 ; i++){
            checkResultCumulate(data1, sc.nextInt());
        }

    }
    public static void checkResultCumulate(List<Integer> list, int num){
        for(int i=0 ; i<list.size() ; i++) {
            for (int j = i; j < list.size() - 1; j++) {
                int resCount = list.get(i) + list.get(j + 1);
                if (resCount == num) {
                    System.out.println(list.get(i) + " " + list.get(j + 1));
                }
                if (resCount > num) {
                    break;
                }

            }
        }
    }


}
