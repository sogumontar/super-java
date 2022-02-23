package banksoal.Kiek;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Soal10, v 0.1 2/21/22 5:39 PM Sogumontar Hendra Exp $$
 */
public class Soal10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tahun : ");
        int tahun = sc.nextInt();
        System.out.print("Jabatan");
        String jabatans = sc.next();
        String jabatan = jabatans.toLowerCase();
        if(jabatan.equals("staff")){
            if(tahun>=0 && tahun <=5){
                System.out.println("1xGaji");
            }else if(tahun<=10){
                System.out.println("2xGaji");
            }else if(tahun<=15){
                System.out.println("3xGaji");
            }else{
                System.out.println("4xGaji");
            }
        }else if(jabatan.equals("manajer")){
            if(tahun>=0 && tahun <=5){
                System.out.println("2xGaji");
            }else if(tahun<=10){
                System.out.println("3xGaji");
            }else if(tahun<=15){
                System.out.println("4xGaji");
            }else{
                System.out.println("5xGaji");
            }

        }else if(jabatan.equals("direksi")){
            if(tahun>=0 && tahun <=5){
                System.out.println("3xGaji");
            }else if(tahun<=10){
                System.out.println("4xGaji");
            }else if(tahun<=15){
                System.out.println("5xGaji");
            }else{
                System.out.println("6xGaji");
            }
        }
    }
}
