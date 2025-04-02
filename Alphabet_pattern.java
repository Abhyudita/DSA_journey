//Que-Write a java program that gives the following pattern for n number of rows.
//A
//BC
//DEF
//GHIJ
//KLMNO

import java.util.Scanner;
public class Practice_alphabet_pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");//4
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char start='A';
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
    }
}
