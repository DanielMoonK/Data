public class Data{
    public static final int MAX = 10000;
    private int[][] grid; 

    public Data(int[][] g){
        grid = g;
    }

    public String toString(){
        String str = "";
        for (int row=0; row < grid.length; row++){
            for(int col=0; col < grid[row].length; col++){
                str += grid[row][col] + " ";
            }
            str += "\n";
        }
        return str;
    }

    public void repopulate(){
        for (int row=0; row < grid.length; row++){
            for(int col=0; col < grid[row].length; col++){
                int value = (int)(Math.random() * MAX) + 1;
                if(value % 10 == 0 && value % 100 != 0){
                    grid[row][col] = value;
                }
            }
        }
    }

    public int countIncreasingCols(){
        int countInner = 0;
        int countOuter = 0;
        for(int col=0; col<grid[0].length; col++){
            countInner = 0;
            for(int row=0; row<grid.length-1; row++){
                // System.out.println(grid[row][col]); Checks current number
                // System.out.println(grid[row+1][col]); Checks following number
                if(grid[row][col]<=grid[row+1][col]) countInner++;
                // System.out.println(countInner); Checks whether countInner incremented
            }
            // System.out.println("Inner done"); Confirms completion of inner loop
            if(countInner == grid.length-1) countOuter++;
            // System.out.print("Outer done: ");
            // System.out.println(countOuter); Confirms completion of outer loop and checks whether outerCount incremented
        }
        return countOuter;
    }
}