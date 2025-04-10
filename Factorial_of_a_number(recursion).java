//Que-Write a java program that gives the factorial of a number using recursion.

import java.util.Scanner;
public class Practice_recursion_factorial {
    static int factorial(int num,int fact){//0,120
        if(num==0){
            return fact;
        }
        fact=fact*num;//120
        return factorial(num-1,fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(factorial(num,1));
    }
}
