package banksoal.Traveloka;

import java.util.*;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : slowestKey, v 0.1 5/4/23 11:23 AM Sogumontar Hendra Exp $$
 */
public class slowestKey {

    public static char slowestKey(List<List<Integer>> keyTimes) {
        // Write your code here
        int best=keyTimes.get(2).get(1);
        int huruf =keyTimes.get(2).get(0);
        for(int i=2 ; i<keyTimes.size() -1  ; i++){
            int val = keyTimes.get(i+1).get(1) - keyTimes.get(i).get(1);
            if(best<val){
                best = val;
                huruf = keyTimes.get(i).get(0);
            }
        }
        char c = (char) (huruf+97);
        return c;

    }

    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        List<Integer>list3 = new ArrayList<>();
        List<Integer>list4 = new ArrayList<>();
        List<Integer>list5 = new ArrayList<>();
        List<Integer>list6 = new ArrayList<>();
        List<Integer>list7 = new ArrayList<>();
        List<Integer>list8 = new ArrayList<>();
        List<Integer>list9 = new ArrayList<>();
        List<Integer>list10 = new ArrayList<>();
        List<Integer>list11 = new ArrayList<>();
        list1.add(9);
        list2.add(2);
        list3.add(0);
        list3.add(3);
        list4.add(20);
        list4.add(5);
        list5.add(2);
        list5.add(6);
        list6.add(15);
        list6.add(7);
        list7.add(9);
        list7.add(8);
        list8.add(19);
        list8.add(9);
        list9.add(24);
        list9.add(10);
        list10.add(4);
        list10.add(12);
        list11.add(3);
        list11.add(13);
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);
        listOfList.add(list4);
        listOfList.add(list5);
        listOfList.add(list6);
        listOfList.add(list7);
        listOfList.add(list8);
        listOfList.add(list9);
        listOfList.add(list10);
        listOfList.add(list11);
        System.out.println(slowestKey(listOfList));
    }
}
