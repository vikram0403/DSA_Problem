package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrangePosAndNeg {
    public static int[] PosAndNeg(int arr[]){
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();

        for(int i =0;i<arr.length;i++){
            if(0<arr[i]){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        int result[]=new int[arr.length];
        int i=0,j=0,k=0;

        while(i<pos.size() && j< neg.size()){
            result[k++]= pos.get(i++);
            result[k++]=neg.get(j++);
        }
        while(i<pos.size()){
            result[k++]=pos.get(i++);
        }
        while (j<neg.size()){
            result[k++]=neg.get(j++);
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={3,1,-2,-5,2,-4};
        arr=PosAndNeg(arr);

        for(int num:arr){
            System.out.print(num +",");
        }
    }


}
