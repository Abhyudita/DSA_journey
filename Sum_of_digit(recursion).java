//Que-Write a java program that calculates the sum of digits of a number using recursion.

import java.util.Scanner;
public class Practice_recursion_sum_of_digit {
    static int sum=0;
    static int sum_of_digits(int n){
        if(n==0){
            return sum;
        }
       int digit=n%10;
        sum+=digit;
        return sum_of_digits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        System.out.println(sum_of_digits(num));
    }
}
