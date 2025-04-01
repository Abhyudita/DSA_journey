//Que-Write a program that print eight using star for n number of rows.

import java.util.Scanner;
public class Practice_8_star {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<2*n;row++){
            for(int col=1;col<=n;col++){
                if((col==1||col==n) && (row==1||row==n||row==2*n-1)){
                    System.out.print(" ");
                }
                else if (col==1||col==n||row==1||row==n||row==2*n-1) {
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
