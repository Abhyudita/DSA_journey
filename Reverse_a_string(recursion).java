//Que-Write a java program that reverses a string using recursion.

import java.util.Scanner;
public class Practice_recursion_reverse_string {
    static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        String s=reverse(str.substring(1));
        char first_char=str.charAt(0);
        return s+first_char;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(reverse(str));
    }
}
