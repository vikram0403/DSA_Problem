package Arrays;

import java.util.ArrayList;

public class IntersectionArray {
    public static int[] interArray(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> inter=new ArrayList<>();

        while(i<n && j<m){
          if(i>0 && arr1[i]==arr1[i-1]){
              i++;
              continue;
          }
          if(j>0 && arr2[j]==arr2[j-1]){
              j++;
              continue;
          }
          if(arr1[i]<arr2[j]){
              i++;
          }
          else if(arr1[i]>arr2[j]){
              j++;
          }
          else{
              inter.add(arr1[i]);
              i++;
              j++;
          }
        }


        int arr[]=new int[inter.size()];
        for(int k =0; k<inter.size();k++){
            arr[k]=inter.get(k);
        }
        return arr;

    }
    public static void main(String arg[]){
        int arr1[]={1, 1, 2, 2, 2, 4};
        int arr2[]={2, 2, 4, 4};
        int []arr=interArray(arr1,arr2);
        for(int num:arr){
            System.out.print(num + " ,");
        }
}
}
