package Arrays;

public class Largest_Element {
    public static int largestElements(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }

        }
        return largest;
    }

    public static void main(String args[]){
        int arr[]={3, 3, 0, 99, -40};
        int large=largestElements(arr);
        System.out.println("largest Elements:"+large);
    }


}
