package Arrays;

public class MoveZero {
    public static int[] move(int arr[]){
        int left=0;
        for (int i =0; i<arr.length;i++){
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]={0,1,0,3,12};
        arr=move(arr);
        for(int num: arr){
            System.out.print(num+",");
        }
    }
}
