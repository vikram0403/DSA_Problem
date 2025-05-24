package Arrays;

public class RotateArrayleftone {
    public static  int[] rotatedArray(int arr[]){
        int temp =arr[0];
        int n = arr.length;
        for (int i =1 ;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return  arr;
    }
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,6,7};
       arr= rotatedArray(arr);
        for (int num:arr){
            System.out.print(num+" ,");
        }
    }

}
