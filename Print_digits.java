//Que-Write a code that prints all the digits of a number 
import java.util.Scanner;
public class Practice_print_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");//123
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(temp>0){
            count++;//3
            temp=temp/10;
        }
        int digit;
        int rem;
        while(count!=0){//to print the zeroes in the end
            digit= (int)(num/ Math.pow(10,count-1));//3/1
            System.out.println(digit);//3
            num=num%((int)Math.pow(10,count-1));//123%100
            count=count-1;//1

        }
    }
}
