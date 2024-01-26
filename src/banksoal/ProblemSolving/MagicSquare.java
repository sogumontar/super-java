/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.*;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: MagicSquare.java, v 0.1 2024‐01‐26 14.24 dongsheng.hds Exp $$
 */
public class MagicSquare {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();
        List<Integer> intList3 = new ArrayList<>();
        intList1.add(6);
        intList1.add(1);
        intList1.add(2);
        intList2.add(7);
        intList2.add(2);
        intList2.add(6);
        intList3.add(5);
        intList3.add(6);
        intList3.add(2);
        list.add(intList1);
        list.add(intList2);
        list.add(intList3);
        System.out.println(formingMagicSquare(list));

    }
        public static int formingMagicSquare(List<List<Integer>> s) {
            int[][][] possiblePermutations = {
                    {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                    {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                    {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                    {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                    {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                    {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                    {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                    {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
            };

            int minCost = Integer.MAX_VALUE;

            for (int[][] permutation : possiblePermutations) {
                int cost = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        cost += Math.abs(s.get(i).get(j) - permutation[i][j]);
                    }
                }

                minCost = Math.min(minCost, cost);
            }

            return minCost;
        }

}