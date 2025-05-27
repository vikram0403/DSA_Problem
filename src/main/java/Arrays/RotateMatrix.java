package Arrays;

public class RotateMatrix {
    public static int [][] Rotate(int [][]arr){
        int n= arr.length;
        int m=arr[0].length;

        for(int i =0; i<n;i++){
            for(int j=i; j<n;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i =0;i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }
        }
        return arr;
    }
public static void main(String args[]){
    int[][] matrix = {
            { 1, 2, 3 },
            { 5, 6, 7},
            { 9, 10, 11 }
    };
    Rotate(matrix);
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(); // Move to next line after each row
    }

}
}
