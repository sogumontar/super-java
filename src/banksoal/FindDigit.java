package banksoal;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/10/2021.
 */
public class FindDigit {
  public static void main(String[] args) {

    digit(100);
  }
  public static void digit(int number){
    if(number>0  && number< 10){
      System.out.println("satuan");
    }else if(number>9 && number<100){
      System.out.println("puluhan");
    }else if(number>99 && number<1000){
      System.out.println("ratusan");
    }else if(number>999 && number<10000){
      System.out.println("ribuan");
    }else if(number>9999 && number<100000){
      System.out.println("puluhribuan");
    }else{
      System.out.println("angka tidak dikenali");
    }
  }
}
