package Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement3 {
    public static  List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (candidate1 == num)
                count1++;
            else if (candidate2 == num)
                count2++;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }

        List<Integer> ans = new ArrayList<>();
        int val=nums.length/3;
        if (count1 >val)
            ans.add(candidate1);
        if (count2 > val)
            ans.add(candidate2);

        return ans;
    }
    public static void main(String args[]){
        int arr[]={3,2,3};
        List<Integer>list = new ArrayList<>();

        list= majorityElement(arr);

        for(int num:list){
            System.out.print(num+",");
        }

    }

}
