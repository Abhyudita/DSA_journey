//Que-Write a program that finds the lcm of two numbers.

import java.util.Scanner;
public class Practice_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        int a=num1;
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        int b=num2;
        //LCM=a*b/GCD
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }
            else{
                num2=num2-num1;
            }
        }
        int gcd=num1;
        int lcm=(a*b)/gcd;
        System.out.println("LCM is "+lcm);
    }
}
