package Lecture08;

public class NGEL {
    static int[] ngel(int[] arr){
        int maxE = 0;
        int[] ngel = new int[arr.length];
        for(int i=0; i<=arr.length-1 ;i++){
            ngel[i]= maxE;
            maxE = Math.max(maxE, arr[i]);
        }
        return ngel;
    }
    static void Display(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={7,8,5,6,3,4,1,2};
        Display(ngel(arr));
    }
}
