//Que-Write a java program that prints a reverse hollow pyramid for n number of rows.

import java.util.Scanner;
public class Practice_reverse_hollow_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=2*n-1;col++){
                if (row==1||row==col ||col==n*2-row) {
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
