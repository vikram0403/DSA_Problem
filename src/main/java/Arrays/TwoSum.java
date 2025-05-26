package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] sum (int arr[],int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0; i<arr.length;i++){
            int comp= target-arr[i];
            if (map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }else {
                map.put(arr[i],i);
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int target=9;

        int ans[]=sum(arr,target);
        for(int num:ans){
            System.out.print(num +",");
        }
    }

}
