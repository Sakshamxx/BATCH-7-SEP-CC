package Lecture08;

public class NGER {
    static int[] nger(int[] arr){
        int maxE = 0;
        int[] nger = new int[arr.length];
        for(int i=arr.length -1; i>=0;i--){
            nger[i]= maxE;
            maxE = Math.max(maxE, arr[i]);
        }
        return nger;
    }
        static void Display(int[] arr){
            for(int i=0;i<=arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
            int[] arr={7,8,5,6,3,4,1,2};
            Display(nger(arr));
        }
}
