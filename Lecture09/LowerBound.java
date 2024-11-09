package Lecture09;

public class LowerBound {
    static int lowerbound(int[] arr, int num){
        int low=0;
        int high= arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = (high + low)/2;
            if(num==arr[mid]){
                ans= mid;
                high= mid -1;
            }
            else if(num>arr[mid]){
                low= mid+1;
            }
            else
                high=mid-1;
            }
            return ans;
        }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,4,5};
        System.out.println(lowerbound(arr, 3));
    }
}
