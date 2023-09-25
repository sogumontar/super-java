package banksoal.Traveloka;

import java.util.*;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : bestGroups, v 0.1 5/4/23 9:59 AM Sogumontar Hendra Exp $$
 */
public class bestGroups {

    // Function to return the depth of the tree
    static int depth(int x, Vector<Integer> vec[]) {
        int max = 0;

        // Find the maximum depth of all its children
        for (Integer val : vec[x]) {
            max = Math.max(max, depth(val, vec));
        }

        // Add 1 for the depth of the current node
        return max + 1;
    }

    // Function to return
    // the minimum number of groups required
    static int minimumGroups(int n, int par[]) {
        Vector<Integer>[] child = new Vector[n + 1];
        for (int i = 0; i <= n; i++) {
            child[i] = new Vector<Integer>();
        }

        // For every node create a list of its children
        for (int i = 1; i <= n; i++)
            if (par[i] != -1)
                child[par[i]].add(i);
        int res = 0;

        for (int i = 1; i <= n; i++)

            // If the node is root
            // perform dfs starting with this node
            if (par[i] == -1)
                res = Math.max(res, depth(i, child));

        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int par[] = {  4,1,-1,3,-1 };
        int n = par.length - 1;
        System.out.print(minimumGroups(n, par));
    }
}
