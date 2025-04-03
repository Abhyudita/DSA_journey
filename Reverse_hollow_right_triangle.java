//Que-Write a java program that prints a reverse hollow right triangle for n number of rows.

import java.util.Scanner;
public class Practice_hollow_right_triangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==n || col==1){
                    System.out.print("*");
                }
                else if (row==col) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
