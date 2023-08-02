int diagonalSum(int** mat, int matSize, int* matColSize){
    int sum=0;
    for(int i=0;i<matSize;i++)
    {
        for(int j=0;j<*matColSize;j++)
        {
            if(i==j)
            sum+=mat[i][j];
            else if(i+j==matSize-1)
            sum+=mat[i][j];
        }
    }
    return sum;

}