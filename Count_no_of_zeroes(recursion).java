//Que-Write a java program that counts the number of zeroes in a number using recursion.

import java.util.Scanner;
public class Practice_recursion_count_no_of_zeroes {
    static int count_zeroes(String num,int count,int index){
        if(index==num.length()){
            return count;
        }
        if(num.charAt(index)=='0'){
            count++;
        }
        return count_zeroes(num,count,index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String num=sc.next();
        System.out.println(count_zeroes(num,0,0));
    }
}
