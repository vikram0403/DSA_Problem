package Arrays;

public class SearchMatrix {
    public static boolean search(int mat[][],int traget){
        int row=mat.length;
        int col=mat[0].length;
        int low =0;
        int high = row*col-1;

        while(low<=high){
            int mid=(low+high)/2;

            int r=mid/col;
            int c=mid%col;

            int value=mat[r][c];

            if(value==traget){
                return true;
            }else if(value < traget){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return  false;
    }
    public static void main (String args[]){

        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target=15;
        boolean ans= search(mat,target);
        System.out.print(ans);
    }

}
