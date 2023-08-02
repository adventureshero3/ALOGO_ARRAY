class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int [][] arr=new int[column][row];
        int i=0,j=0;
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}