package Arrays;

public class KadanesAlgo {
    public static int max(int arr[]){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>maxi){
                maxi=sum;
            }else if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }

    public static void main(String arg[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=max(arr);
        System.out.print(sum);
    }


}
