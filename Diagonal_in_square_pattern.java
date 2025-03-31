//Que-Write a java program that prints a pattern which gives diagonals in a square for n number of rows.

import java.util.Scanner;
public class Practice_diagonal_in_square {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==1 || row==n || col==1 || col==n || row==col || col==n-row+1){
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
