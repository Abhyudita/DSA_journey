//Que-Write a code that cheks whether a number is a strong number or not.
//A "strong number" is a positive integer where the sum of the factorials of its digits equals the original number itself.

import java.util.Scanner;
public class Practice_strong_number {
    static int fact(int num){
        if(num==1 || num==0){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        int rem=0;
        while(num>0){
            rem=num%10;
            sum=sum+ fact(rem);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}
