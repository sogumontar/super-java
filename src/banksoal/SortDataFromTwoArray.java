package banksoal;

import java.util.ArrayList;
import java.util.List;


public class SortDataFromTwoArray {
  public static void main(String[] args) {
    int a[] = {2, 4, 5, 7, 8, 10};
    int b[] = {5, 9, 12, 14, 16};

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < b.length; i++) {
      list.add(b[i]);
      list.add(a[i]);
    }
    Integer arr[] = new Integer[list.size()];
    list.toArray(arr);
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = 0; j < list.size() - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
