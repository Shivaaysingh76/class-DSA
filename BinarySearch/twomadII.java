package BinarySearch;

public class twomadII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=0;
        int n=matrix[0].length-1;
        while(m<matrix.length && n>=0){
            if(matrix[m][n]==target) return true;
            else if(target<matrix[m][n]){
                n--;
            }
            else m++;
        }
        return false;
        
    }
}
