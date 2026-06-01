class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
         if(matrix == null || matrix.length == 0) return result;
  int s_row = 0, e_row = matrix.length-1, s_col = 0, e_col = matrix[0].length - 1;
      while(s_row <= e_row && s_col <= e_col) {
            for(int j = s_col; j <= e_col; j++) {
                result.add(matrix[s_row][j]);
            }  
            s_row ++;
        
        for(int i = s_row; i <= e_row; i++) {
            result.add(matrix[i][e_col]);
        }
         e_col--;
         if(s_row <= e_row) {
         for(int j = e_col; j >= s_col; j--) {
            result.add(matrix[e_row][j]);
         }
          e_row--;
         }


          if(s_col <= e_col) {
          for(int i = e_row; i >= s_row; i--) {
              result.add(matrix[i][s_col]);
          }
          s_col++;
        }
      }
        return result;
       
       }

}
    