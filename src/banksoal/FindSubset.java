package banksoal;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Sogumontar Hendra Simangunsong on 8/11/2021.
 */
public class FindSubset {
  public static void main(String[] args) {
    SortedSet<Integer> s = new TreeSet<>();
    s.add(1);
    s.add(5);
    s.add(2);
    s.add(3);
    s.add(9);

    System.out.print("Elements range between 2 and 9 in set are : "
        + s.subSet(2, 9));
  }
}
