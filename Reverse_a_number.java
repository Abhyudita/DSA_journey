//Que-Write a code that reverses a number.
import java.util.Scanner;
public class Practice_reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();//123
        int rem;
        int result=0;
        while(num>0){//1
            rem=num%10;//1
            num=num/10;//0
            result=result*10+rem;//321
        }
        System.out.println("Reversed number is "+result);
    }
}
