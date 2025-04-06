//Que-Write a java program that tells whether a number is an armstrong number or not.

import java.util.Scanner;
public class Practice_recursion_armstrong_number {
    static int count(int num){
        int copy=num;
        int count=0;
        while(copy>0){
            count+=1;
            copy/=10;
        }
        return count;
    }
    static void armstrong(int num,int count,int result,int copy){//0,3,152,153
        if(num==0){
            if(result==copy){
                System.out.println("Armstrong");
                return;
            }
            else{
                System.out.println("Not an armstrong");
                return;
            }
        }
        result+=(int)Math.pow(num%10,count);
        armstrong(num/10,count,result,copy);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int c=count(num);
        int result=0;
        int copy=num;
        armstrong(num,c,result,copy);
    }
}
