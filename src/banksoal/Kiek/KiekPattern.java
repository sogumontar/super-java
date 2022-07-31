package banksoal.Kiek;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : KiekPattern, v 0.1 7/6/22 5:12 PM Sogumontar Hendra Exp $$
 */
public class KiekPattern {

    public static void main(String[] args) {
        int counter=1;
        int pos=1;
        int lastCounter=0;
        for(int i=1 ; i<=10 ; i++){
            int temp=1;
            for(int j=1 ; j<=10 ; j++){
                if(i>=lastCounter && i<=counter+pos && j>=counter && j<counter+pos ){

                        System.out.print("X");
                        temp++;


                }else{
                    if(j==10){
                        pos++;
                    }
                    System.out.print("-");
                }
            }
            if(i == lastCounter + counter ) {
                lastCounter+=counter;
                counter++;
            }
            System.out.println(" " + lastCounter);
        }
    }
}
