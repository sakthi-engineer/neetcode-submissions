class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row=9;
        int col=9;
        for(int i=0;i<row;i++){
            int[] count = new int[10];
            for(int j=0;j<col;j++){
                if(board[i][j]=='.') continue;
                char n=board[i][j];
                count[n-'0']++;
                if(n>'9' || count[n-'0']>1){
                    return false;
                }
            }
        }
        for(int i=0;i<row;i++){
           int[] count = new int[10];
            for(int j=0;j<col;j++){
                if(board[j][i]=='.') continue;
                char n=board[j][i];
                count[n-'0']++;
                if(n>'9' || count[n-'0']>1){
                    return false;
                }
            }
        }
        for(int i=0;i<9;i+=3){
            for(int o=0;o<9;o+=3){
            int[] count = new int[10];
            for(int j=i;j<i+3;j++){
                for(int k=o;k<o+3;k++){
                    if(board[j][k]=='.') continue;
                    char n=board[j][k];
                    count[n-'0']++;
                    if(n>'9' || count[n-'0']>1){
                        return false;
                    }
                }
            }
            }
        }
        return true;
    }
}

