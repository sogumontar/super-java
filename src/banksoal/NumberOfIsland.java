package banksoal;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/27/2021.
 */
public class NumberOfIsland {
  boolean isSafe(int M[][], int row, int col,
      boolean visited[][])
  {
    return (row >= 0) && (row < 5) && (col >= 0) && (col < 5) && (M[row][col] == 1 && !visited[row][col]);
  }

  void DFS(int M[][], int row, int col, boolean visited[][])
  {
    int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
    int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

    visited[row][col] = true;

    for (int k = 0; k < 8; ++k)
      if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited))
        DFS(M, row + rowNbr[k], col + colNbr[k], visited);
  }

  int countIslands(int M[][])
  {
    boolean visited[][] = new boolean[5][5];

    int count = 0;
    for (int i = 0; i < 5; ++i)
      for (int j = 0; j < 5; ++j)
        if (M[i][j] == 1 && !visited[i][j])
        {
          DFS(M, i, j, visited);
          ++count;
        }

    return count;
  }

  public static void main(String[] args) {
    int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
        { 0, 1, 0, 0, 1 },
        { 1, 0, 0, 1, 1 },
        { 0, 0, 0, 0, 0 },
        { 1, 0, 1, 0, 1 } };
    numberOfIsland I = new numberOfIsland();
    System.out.println("Number of islands is: " + I.countIslands(M));

  }
}
