package Arrays;

public class Linear_Search {
    public static  boolean search(int arr[],int traget){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==traget){
                return  true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int traget=10;
        boolean status=search(arr,traget);
        System.out.println("Status :" +status);
    }


}
