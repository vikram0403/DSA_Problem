package Arrays;

public class RotateArrayDtime {

    // left rotate arrya

//    public static void Reverse(int arr[], int start, int end){
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//
//    }
//    private static void RotateArray(int arr[], int d, int size){
//        Reverse(arr, 0, d - 1);         // Reverse first d elements
//        Reverse(arr, d, size - 1);      // Reverse the rest
//        Reverse(arr, 0, size - 1);      // Reverse entire array
//    }
//
//    public static void rotate(int[] nums, int k) {
//
//        int n=nums.length;
//        k=k%n;
//        if(k<0){
//            k=k+n;
//        }
//        RotateArray(nums, k,n);
//
//    }


//  Right rotate array
public static void Reverse(int arr[], int start, int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }

}
    private static void RotateArray(int arr[], int d, int size){
        Reverse(arr, size - d, size - 1);  // Reverse last d elements
        Reverse(arr, 0, size - d - 1);     // Reverse first n-d elements
        Reverse(arr, 0, size - 1);
    }

    public static void rotate(int[] nums, int k) {

        int n=nums.length;
        k=k%n;
        if(k<0){
            k=k+n;
        }
        RotateArray(nums, k,n);

    }


    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int d=3;
        rotate(arr,d);

        for(int num:arr){
            System.out.print(num);
        }
    }


}
