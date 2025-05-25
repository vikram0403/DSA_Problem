package Arrays;

import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int n= nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i =0; i<n;i++){
            if(map.containsKey(nums[i])){

                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for (int i =0; i<nums.length;i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return 0;

    }
public static void main(String args[]){
        int arr[]= {2,2,1,3,3,3,9,9,2,1,6,7,7};
       int ans= singleNumber(arr);
       System.out.print(ans);
}

}
