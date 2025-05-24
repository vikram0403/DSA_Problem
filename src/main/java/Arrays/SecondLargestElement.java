package Arrays;

public class SecondLargestElement {
    public static int secondlargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int Slargest = 0;
        for(int i =0; i<arr.length; i++){
            if (largest < arr[i]) {
                Slargest=largest;
                largest=arr[i];
            }
            else if(Slargest<arr[i] && arr[i]!=largest){
                Slargest=arr[i];
            }
        }
        return Slargest;
    }
public static void main(String args[]){
//        int arr[]={8, 8, 7, 6, 5};
        int arr[]={1,2,3,4,5,5,6,7,8,9};
        int Slargest =secondlargest(arr);
        System.out.println("SecondLargest :"+Slargest);
}

}
