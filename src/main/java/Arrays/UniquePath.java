package Arrays;

import java.util.Arrays;

public class UniquePath {
    public static int fun(int i,int j,int [][]dp){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up= fun(i-1,j,dp);
        int left=fun(i,j-1,dp);
        return up+left;
    }

    public static int path(int m,int n){
        int dp[][]=new int [m][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return fun(m-1,n-1,dp);
    }

    public static void main(String args[]){
        int m=3;
        int n=7;
        int result=path(m,n);
        System.out.print(result);
    }


}
