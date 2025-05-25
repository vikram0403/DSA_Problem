package Arrays;

import java.util.Arrays;

public class MissingNum {
    public static int missing(int arr[]){
        int n =arr.length;
        int sum =n*(n+1)/2;
        int s2=0;
        for(int i =0; i<n;i++){
            s2=s2+arr[i];
        }
        int missingNum= sum-s2;
        return missingNum;
    }
public static  void main(String args[]){
        int arr[]={3,2,1,0,5};
       int mis= missing(arr);
       System.out.print(mis);
}

}
