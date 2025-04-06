//Que-Write a java program that compues power of a number.

import java.util.Scanner;
public class Practice_recursion_compute_power_int {
    static int power(int num,int power,int result){//2,0,2
        if(power==0){
            return result;
        }
        result=num*result;//8
        power--;//0
        return power(num,power,result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the power");
        int p=sc.nextInt();
        int result=1;
        System.out.println(power(num,p,result));
    }
}
