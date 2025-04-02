//Que-Write a java program that gives the following oattern for n number of rows:
//A
//AB
//ABC
//ABCD
//ABCDE

import java.util.Scanner;
public class Practice_alphabet_pattern2 {
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
            start='A';
            System.out.println();
        }
    }
}
