package Arrays;

public class MajorityElement2 {
    public static int majority(int arr[]){
        int count=1;
        int mar=arr[0];
        for (int i=1; i<arr.length;i++){
            if(count==0){
                mar=arr[i];
                count=1;
            }else if(arr[i]==mar){
                count++;
            }else{
                count--;
            }
        }
        return mar;
    }
    public static void main(String args[]){
        int arr[]={2,2,1,1,1,2,2};
        int mar=majority(arr);
        System.out.print(mar);
    }

}
