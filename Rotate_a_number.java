//Que-Write a code that rotates a number by k places.
import java.util.Scanner;
public class Practice_rotate_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        System.out.println("Enter the number of rotations");
        int k=sc.nextInt();
        //num=12345,k=1   result=51234
        //k=2, result=45123
        int count=0;
        int temp=num;
        int result=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int rem=num%(int)Math.pow(10,k);
        num=num/(int)Math.pow(10,k);
        result=rem*(int)Math.pow(10,count-k) + num;
        System.out.println(result);
    }
}
