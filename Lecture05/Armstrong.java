package Lecture05;
import java.util.*;
public class Armstrong {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(IsArmstrong(x));
        sc.close();
    }
}
