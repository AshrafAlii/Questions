class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List <Integer> res = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            int rowMin = matrix[i][0];
            int colIndex = 0;

            for(int j =1; j< matrix[i].length; j++){
                if(matrix[i][j] < rowMin){
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isLucky = true;
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][colIndex] > rowMin){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky) res.add(rowMin);
        }
        return res;
    }
}