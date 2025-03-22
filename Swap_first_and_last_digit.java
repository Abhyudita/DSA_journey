//Que-Write a code that swaps the first and last digit of a number.

import java.util.Scanner;
public class Practice_swap_first_last_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int last=num%10;
        int first=num/(int)Math.pow(10,count-1);
        int rem_num=num%(int)Math.pow(10,count-1);
        rem_num=rem_num/10;
        int result=rem_num*10+first;
        result=last*(int)Math.pow(10,count-1) + result;
        System.out.println(result);
    }
}
