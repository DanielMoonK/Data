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
        int countOuter = 0;
        int countInner = 0;
        for(int row=0; row<grid[0].length; row++){
            for(int col=0; col<grid.length; col++){
                if(grid[row][col]<grid[row][col])
            }

            if(countInner == grid.length) countOuter++;
            countInner = 0;
        }
        return countOuter;
    }
}