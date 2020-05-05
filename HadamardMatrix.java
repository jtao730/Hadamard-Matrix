/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Jennifer
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix 
{
    public static void main(String[] args)
    {
    int n = Integer.parseInt(args[0]);   
    boolean[][] grid = new boolean[n][n];

    grid[0][0] = true; 

    for (int k = 1; k<n; k+=k)
    {
        for (int i = 0; i<k; i++)
         {
            for (int j = 0; j<k; j++)
            {
                grid[i+k][j] =  grid[i][j];
                grid[i][j+k] =  grid[i][j];
                grid[i+k][j+k] = (!grid[i][j]);
            }
         }
        }
    
        for (int i = 0; i<n; i++)
        {
            for (int j = 0; j<n; j++)
            {
            if (grid[i][j])
                System.out.print("T ");
            else 
                System.out.print("F ");
            }
        System.out.println(); 
        }
    }
}


