package banksoal;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/10/2021.
 */
public class SimpleMultiplication {
  public static void main(String[] args) {
    multiplication(2);
  }
  public static void multiplication(int number){
    for(int i=1 ; i<=10 ; i++){
      System.out.println(number + " x " + i + " = " + i*number);
    }
  }
}
