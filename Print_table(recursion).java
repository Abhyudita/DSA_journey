//Que-Write a java program that prints the table of any number using recursion.

import java.util.Scanner;
public class Practice_recursion_print_table {
    static void table(int n,int i){//5,11
        if(i==11){
            return;
        }
        System.out.println(n+"X"+i+"="+n*i);
        table(n,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        table(num,1);
    }
}
