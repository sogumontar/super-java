package banksoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/3/2021.
 */
public class Sempetgakya {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int inp = in.nextInt();

    List<String> CI = new ArrayList<>();
    List<String> CD = new ArrayList<>();
    List<Double> F = new ArrayList<>();
    List<Integer> G = new ArrayList<>();
    List<String> D = new ArrayList<>();
    List<Integer> GF = new ArrayList<>();
    Boolean sempat =true;
    String R = "";
    String plus = "";
    for (int i = 0; i < inp; i++) {
      CI.add(in.next());
      CD.add(in.next());
      F.add(in.nextDouble());
      G.add(in.nextInt());
      D.add(in.next());
      GF.add(in.nextInt());
    }
    R = in.next();
    plus = in.next();
    String splitStr[] = R.split("-");
    Double jam_final=0.0;
    Integer selisih=0;
    for (int i = 0; i < splitStr.length - 1; i++) {
      Double jam = 0.0;
      Integer menit=0;
      int index_final = 0;
      int index = CI.indexOf(splitStr[i]);
      int index2 = CD.indexOf(splitStr[i + 1]);
      index_final = index;
      if (index2 > index) {
        index_final = index2;
      }
      jam=F.get(index_final);
      menit+=G.get(index_final);
      menit+=GF.get(index_final);
      int temp = menit/60;
      int mTemp = menit%60;
      double jam_tot=temp;
      double temp2= (double)mTemp/100.0;
      jam_tot+=temp2;
//      System.out.println(jam_tot);
      jam+=temp;
      jam+=temp2;
      if(jam>24.00){
        jam%=24;
      }
      jam_final = jam;

      String home =D.get(CI.indexOf(splitStr[i])).replace("+","");
      String away =D.get(CI.indexOf(splitStr[i+1])).replace("+","");
//      System.out.println(home + "  " + away);

       selisih =((Integer.parseInt(away)- Integer.parseInt(home)));
      Double jam_nyampe = jam+ selisih;
      if(jam_nyampe == 24.00){
        jam_nyampe= 00.00;
      }
      if(jam_nyampe>24){
        jam_nyampe-=24;
      }else if(jam_nyampe<0){
        jam_nyampe+=24;
      }
//      System.out.println(jam_nyampe + " "+ F.get(index_final+1));
      if(jam_nyampe>F.get(index_final+1)){
        System.out.println("TIDAK SEMPAT");
        sempat= false;
        break;
      }
//      System.out.println(String.format("%.2f", jam) + "   " + menit + "  " + D.get(index_final) + "     " + jam_nyampe + "Selisih = " + selisih);
//      System.out.println("GMT home = "+D.get(CI.indexOf(splitStr[i])) + "   away = " + D.get(CI.indexOf(splitStr[i+1])));
    }
    if(sempat){
      jam_final += selisih;
      if(jam_final>24){
        jam_final-=24;
      }
      System.out.println("SEMPAT-"+ String.format("%.2f", jam_final));
    }
  }
}
