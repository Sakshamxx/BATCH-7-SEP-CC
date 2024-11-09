package Lecture09;

public class CountOccurence {
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
        static int upperbound(int[] arr, int num){
            int low=0;
            int high= arr.length-1;
            int ans=-1;
            while(low<=high){
                int mid = (high + low)/2;
                if(num==arr[mid]){
                    ans= mid+1;
                    low= mid +1;
                }
                else if(num>arr[mid]){
                    low= mid+1;
                }
                else
                    high=mid-1;
                }
                return ans;
            }
    static int countoccurences(int[] arr, int num){
        int a = upperbound(arr, num);
        int b = lowerbound(arr, num);
        return a-b;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2,3,3,4,4,5};
        System.out.println(countoccurences(arr, 1));
    }
}
