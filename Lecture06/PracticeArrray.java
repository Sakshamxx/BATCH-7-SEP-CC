package Lecture06;

public class PracticeArrray {
    static void Display(int[] arr) {
        // for(int i=0;i<=arr.length-1;i++){
        // System.out.print(arr[i]+" ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    static void ReverseArray(int[] arr){
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]+"  ");
    }
}
    static void Swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        Display(arr);
    }
    static void swapWithoutUsingTemp(int[] arr, int i, int j ){
        arr[i]= arr[i] + arr[j];
        arr[j]= arr[i] - arr[j];
        arr[i]= arr[i] - arr[j];
        Display(arr);
    }
    static void copyArray(int[] arr){
        int[] nums = new int[arr.length];
        for(int i=0;i<arr.length;i--){
            nums[nums.length -1 -i]= arr[i];
        }
        // Display(arr);
        // arr=nums;  // SWALLOW COPY

        // 
        // Display(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int [] nums = {1,2,3};
        // arr= nums;
        // ReverseArray(arr);
        // Display(arr);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
            // arr[i]= sc.nextInt();
        // }
        // sc.close();
        // ReverseArray(arr);
        // Swap(arr, 3, 2);
        // Display(arr);
        for(int i=0;i<128;i++){
            System.out.println(i+ " " +(char)i);
        }
    }
}
