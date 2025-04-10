//Que-Write a java program that converts any binary number to decimal number using recursion.

import java.util.Scanner;
public class Practice_recursion_binary_to_decimal {
    static int convert(int num,int sum,int pow){
        if(num==0){
            return sum;
        }
        int digit=num%10;
        sum=sum+digit*(int)Math.pow(2,pow);
        return convert(num/10,sum,pow+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(convert(num,0,0));
    }
}
