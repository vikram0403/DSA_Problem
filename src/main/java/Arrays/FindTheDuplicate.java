package Arrays;

public class FindTheDuplicate {
    public static int duplicate(int arr[]){
        int freq[]=new int[arr.length];
        for(int i =0; i< arr.length;i++){
            if(freq[arr[i]]==0){
                freq[arr[i]]+=1;
            }else{
                return arr[i];
            }
        }
        return 0;
    }
public static void main(String args[]){
        int arr[]={1,3,4,2,2};
        int num=duplicate(arr);
        System.out.print(num);
}

}
