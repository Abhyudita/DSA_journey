//Que-Write a code that calculates the sum of all the numbers on the even and odd places.
import java.util.Scanner;
public class Practice_sum_of_even_odd_position {
    public static void main(String[] args) {
        //position is taken from right
        //eg- for 5678, 8 is on the first position
        //sum for odd=8+6
        //sum for even=7+5
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int odd_sum=0;
        int even_sum=0;
        int count=1;
        int rem;
        while(num>0){
            rem=num%10;
            if(count%2==0){
                even_sum +=rem;
            }
            else{
                odd_sum +=rem;
            }
            count++;
            num=num/10;
        }
        System.out.println("Even sum: "+even_sum);
        System.out.println("Odd sum: "+odd_sum);
    }
}
