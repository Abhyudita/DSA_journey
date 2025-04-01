//Que-Write a program that prints a hollow triangle for n number of rows.

import java.util.Scanner;
public class Practice_hollow_triangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        for(int row=1;row<=n;row++){//5=5
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*row-1;star++){//1=9
                if(row==n || star==1 || star==2*row-1){
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
