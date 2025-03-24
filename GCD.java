//Que-Write a program to find the gcd of two numbers

import java.util.Scanner;
public class Practice_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        int start;
        if(num1<num2){
            start=num1;
        }
        else if(num1>num2){
            start=num2;
        }
        else{
            start=num1;
        }
        while(start>0){
            if(num1%start==0 && num2%start==0){
                System.out.println(start);
                return;
            }
            else{
                start--;
            }
        }
        /* subtraction method
        while(a!=b)
        if(a>b){
        a=a-b
        }
        else{
        b=b-a
        }
         */
        System.out.println("No common divisor");
    }
}
