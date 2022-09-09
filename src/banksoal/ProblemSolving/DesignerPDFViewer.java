package banksoal.ProblemSolving;

import banksoal.BaseRequest;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : DesignerPDFViewer, v 0.1 3/7/22 5:34 PM Sogumontar Hendra Exp $$
 */
public class DesignerPDFViewer extends BaseRequest {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int max=0;
        int length = word.length();
        for(int i=0 ; i< word.length() ; i++){
            int val = Character.getNumericValue(word.charAt(i))-10 ;
            int height = h.get(val);
            if(max<height){
                max=height;
            }
        }
        return (length*max);

    }

    public static void main(String[] args) {
        List<Integer> h = listOfIntegerRequest(singleIntegerRequest());
        String word = singleStringRequest();
        System.out.println(designerPdfViewer(h,word));

    }
}
