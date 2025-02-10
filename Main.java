public class Main{
    public static void main(String[] args){
        int[][] grid1 = new int[5][5];
        Data data1 = new Data(grid1);
        data1.repopulate();
        System.out.println(data1);

        int[][] grid2 = {
            {10, 50, 40},
            {20, 40, 20},
            {30, 50, 30}
        };
        Data data2 = new Data(grid2);
        System.out.println(data2);
        System.out.println(data2.countIncreasingCols());

        int[][] grid3 = {
            {10, 540, 440, 440},
            {220, 450, 440, 190}
        };
        Data data3 = new Data(grid3);
        System.out.println(data3.countIncreasingCols());
    }
}