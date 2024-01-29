/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.*;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: ClimbingTheLeaderBoard.java, v 0.1 2024‐01‐26 17.39 dongsheng.hds Exp $$
 */
public class ClimbingTheLeaderBoard {

    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        List<Integer> player = new ArrayList<>();
        //100 100 50 40 40 20 10
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);
        //5 25 50 120
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);
        System.out.println(climbingLeaderboard(ranked, player));
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> distinctRanked = new ArrayList<>(new LinkedHashSet<>(ranked));
//        Collections.sort(distinctRanked);
        List<Integer> result = new ArrayList<>();
        int j = distinctRanked.size() - 1;
        int ranking = distinctRanked.size()+1;
        for(Integer val : player){

            while (j >= 0 && val >= distinctRanked.get(j)) {
                // Move to the previous rank if the player's score is greater than or equal to the current ranked score
                ranking--;
                j--;
            }
//            for(Integer rank : distinctRanked){
//                if(val>=rank){
//                    ranking--;
//                }else{
//                    break;
//                }
//            }
            result.add(ranking);
        }
        return result;

    }
}