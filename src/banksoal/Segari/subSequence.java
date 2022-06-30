package banksoal.Segari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : subSequence, v 0.1 6/29/22 1:06 PM Sogumontar Hendra Exp $$
 */
public class subSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listData = new ArrayList<>();
        List<Integer> listSequence = new ArrayList<>();
        System.out.println("Input Number");
        int num = sc.nextInt();

        System.out.println("Input sequence");
        int numSeq = sc.nextInt();

        // for Data

        System.out.println("Input data Number");
        for(int i=0 ; i<num ; i++){
            listData.add(sc.nextInt());
        }

        System.out.println("Input data Sequence");
        // for sequence
        for(int i=0 ; i<numSeq ; i++){
            listSequence.add(sc.nextInt());
        }

        System.out.println(checkIfSubSequence(listData,listSequence));

    }

    public static boolean checkIfSubSequence(List<Integer> data, List<Integer> dataSeq ){
        boolean res = true;
        int pos=0;
        for(int i=0 ; i<dataSeq.size() ; i++){
            System.out.println(pos);
            for(int j=pos ; j< data.size() ; j++){
                System.out.println(dataSeq.get(i) + "  " + data.get(j) );
                if(dataSeq.get(i).equals(data.get(j)) ){
                    System.out.println( "test");
                    pos = j;
                    break;
                }
                if(j == data.size()-1 && !dataSeq.get(i).equals(data.get(j))){
                    return false;
                }
            }
        }
        return res;
    }
}

// loop -> seq : array
