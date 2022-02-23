package banksoal.Kiek;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal9, v 0.1 2/21/22 4:00 PM Sogumontar Hendra Exp $$
 */
public class Soal9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuaca : ");
        String cuaca = sc.next();
        System.out.println("Hari : ");
        String hari = sc.next();
        if(!hari.equals("minggu") ||!hari.equals("sabtu")) {
            if (cuaca.equals("cerah") ) {
                System.out.println("WFO");
            } else if (cuaca.equals("mendung")){
                System.out.println("Tidak Bekerja");
            }
        }
    }
}
