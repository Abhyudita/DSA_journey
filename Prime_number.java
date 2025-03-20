//Que-Write a code that checks whether a number is prime or not.
import java.util.Scanner;
public class Practice_prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
