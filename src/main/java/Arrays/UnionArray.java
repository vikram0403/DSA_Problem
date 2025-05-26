package Arrays;

import java.util.ArrayList;

public class UnionArray {
    public static int[] SortArray(int nums1[],int nums2[]){
        int n =nums1.length;
        int m =nums2.length;

        int i =0;
        int j=0;
        ArrayList<Integer> union= new ArrayList<>();

        while(i<n && j<m) {
            if (nums1[i] < nums2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
            } else if(nums1[i]>nums2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++;
            }else {
                if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
            while(i<n){
                if(union.size()==0 || union.get(union.size()-1) != nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }
            while(j<m){
                if(union.size()==0 || union.get(union.size()-1) != nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }

            int arr[]=new int[union.size()];
            for (int k=0;k<arr.length;k++){
                arr[k]=union.get(k);
            }
            return arr;

    }
    public static void main(String arg[]){
        int arr1[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[]={2, 3, 4, 4, 5, 11, 12};
        int []arr=SortArray(arr1,arr2);
        for(int num:arr){
            System.out.print(num + " ,");
        }
    }

}
