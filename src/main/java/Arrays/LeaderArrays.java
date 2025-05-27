package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderArrays {
    public static ArrayList<Integer> Leader(int arr[]){
        int n = arr.length;
        ArrayList<Integer> add= new ArrayList<>();
        int max= Integer.MIN_VALUE;
        for (int i=n-1;i>=0; i--){
            if(arr[i]>max){
                add.add(arr[i]);
            }
            max=Math.max(max,arr[i]);
        }
        Collections.reverse(add);
        return add;
    }

    public static void main(String args[]){
        int arr[]={1, 2, 5, 3, 1, 2};
        ArrayList<Integer>list=new ArrayList<>();
        list=Leader(arr);
        for(int num:list){
            System.out.print(num +",");
        }
    }


}
