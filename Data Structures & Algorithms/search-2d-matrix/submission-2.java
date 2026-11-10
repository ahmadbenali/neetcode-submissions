class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len=matrix.length;
        int row=0;

        int low=0;//0
        int high=matrix[0].length-1;//3

        while(low<=high){

            int middel=low+(high-low)/2;

            //matrix[][] not matrix[]
            if(matrix[row][low]<target && matrix[row][high]<target && (row+1!=len)){
                row++;
            }
            else if(matrix[row][middel]==target){
                return true;
            }
            else if(matrix[row][middel]<target){
                low=middel+1;
            }else{
                high=middel-1;
            }
        }
        return false ;
    }
}
