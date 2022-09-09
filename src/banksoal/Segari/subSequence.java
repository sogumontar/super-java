package banksoal.Segari;

import banksoal.BaseRequest;

import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : subSequence, v 0.1 6/29/22 1:06 PM Sogumontar Hendra Exp $$
 */
public class subSequence extends BaseRequest {
    public static void main(String[] args) {
        System.out.println("Input Number");
        int num = singleIntegerRequest();

        System.out.println("Input sequence");
        int numSeq = singleIntegerRequest();
        List<Integer> listData ;
        List<Integer> listSequence ;

        // for Data
        System.out.println("Input data Number");
        listData = listOfIntegerRequest(num);

        System.out.println("Input data Sequence");
        // for sequence
        listSequence= listOfIntegerRequest(numSeq);
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
