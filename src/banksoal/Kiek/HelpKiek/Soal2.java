package banksoal.Kiek.HelpKiek;

import banksoal.BaseRequest;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal2, v 0.1 4/19/22 10:53 PM Sogumontar Hendra Exp $$
 */
public class Soal2 extends BaseRequest {
    public static void main(String[] args) {
        System.out.println("Jam Masuk : ");
        int jamMasuk = singleIntegerRequest();
        System.out.println("Jam Keluar : ");
        int jamKeluar = singleIntegerRequest();
        System.out.println(countCost(jamMasuk,jamKeluar));
    }

    private static int countCost(int jamMasuk, int jamKeluar){
        int result =0;
        int interval = jamKeluar - jamMasuk;
        if(interval ==1){
            result = 350000;
        }else if(interval == 2){
            result = 500000;
        }else if(interval<8){
            result = interval*150000;
        }else{
            result = interval*100000;
        }
        return result;
    }
}
