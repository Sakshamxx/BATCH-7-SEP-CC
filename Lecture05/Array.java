package Lecture05;

public class Array {
    static void Display(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // int[] arr= new int[5];
        // int[] arr;
        // arr= new int[10];
        // arr[0]= 10;
        // arr[1]= 10;
        // arr[2]= 10;
        // arr[3]= 10;
        // arr[4]= 50;    
        // int[] arr= {10,20,30,40,50};
        // char[] s= new char[10];
        // s[0]='s';
        // s[1]=' ';
        // s[2]='a';
        // s[3]=' ';
        // s[4]='k';
        // s[5]=' ';
        // s[6]='s';
        // s[7]=' ';
        // s[8]='h';
        // s[9]=' ';
        // System.out.println(s);
        // int[] sak= new int[10];
        // int[] num= {1,2,3};
        // arr[0]=0;
        // arr=num;
        // System.out.println(arr);
        // for(int i=1;i<num.length+1;i++){
        //     System.out.print(i+" ");
        // }
        // System.out.println(arr.length);
        int[] arr ={10,20,30,40,50};
        Display(arr);
    }
}