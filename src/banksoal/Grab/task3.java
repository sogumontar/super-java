/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.Grab;

import java.util.*;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: task3.java, v 0.1 2024‐11‐13 07.32 dongsheng.hds Exp $$
 */
public class task3 {
    public static void main(String[] args) {
        int[] D = {1,1,2,5};
        int[] C = {4,9,2,3};
        int P = 19;
        System.out.println(solution(D,C,P));
    }
    public static int solution(int[] D, int[] C, int P) {
        int result = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < D.length; i++) {
            if (map.get(D[i]) == null) {
                map.put(D[i], new ArrayList<>());
            }
            map.get(D[i]).add(C[i]);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> duplicateVal = entry.getValue();

            for (int val : duplicateVal) {

                if (P < val) {
                    return result;
                }

                P -= val;

                result++;
            }
        }

        return result;
    }
}