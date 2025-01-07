/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2025 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: CutTheStick.java, v 0.1 2025‐01‐03 13.54
 */
public class CutTheStick {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(8);
        System.out.println(cutTheSticks(list));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(arr); // Sort the array first

        while (!arr.isEmpty()) {
            result.add(arr.size()); // Add the current size of the array
            int min = arr.get(0); // Get the smallest element
            arr.removeIf(sticks -> sticks == min); // Remove all elements equal to the smallest
        }

        return result;
    }

}
