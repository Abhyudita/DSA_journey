//Que-Write a java program that tells whether a number is palindrome or not.

import java.util.Scanner;
public class Practice_recursion_palindrome_boolean {
    static boolean palindrome(int num,int p,int copy){
        if(num==0){
            if(copy==p){
                return true;
            }
        }
        int digit=num%10;
        p=p*10+digit;
       return palindrome(num/10,p,copy);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int copy=num;
        palindrome(num,0,copy);
        if(palindrome(num,0,copy)==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
