package Lecture05;
import java.util.*;
public class Function {
    static boolean IsArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum + rem*rem*rem;
        }
        if(sum==original){
            return true;
        }else
        return false;
    } 
    static void ReverseNum(int n){
        int temp=0;
        while(n>0){
            temp=n%10;
            n=n/10;
            System.out.print(temp);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int x=sc.nextInt();
        // System.out.println(IsArmstrong(x));
        ReverseNum(x);
        sc.close();
    }
}
