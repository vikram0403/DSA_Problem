package Arrays;

public class StockBuyAndSell {
    public static int stock(int arr[]){
        int n=arr.length;
        int min= arr[0];
        int profit=0;
        for (int i =1;i<n; i++){
            int cost=arr[i]-min;
            profit =Math.max(cost,profit);
            min=Math.min(min,arr[i]);

        }
        return profit;
    }
public static void main(String args[]){
        int arr[]={7,1,5,4,6,2};
        int profit=stock(arr);
        System.out.print(profit);
}

}
