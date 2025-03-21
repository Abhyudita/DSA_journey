//Que-Write a java code that flips the digits with their positions.
import java.util.Scanner;
public class Practice_flip_digit_with_position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        //at position 1=5, put 1 at position 5
        //at position 2=4, put 2 at position 4 and so on
        //result=12543
        int pos=1;
        int result=0;
        int rem;
        int count=0;
        int temp=num;
       /* while(temp>0){
            count++;//5
            temp=temp/10;
        }*/
        while(num>0){
            rem=num%10;
            result=result+pos*(int)(Math.pow(10,rem-1));
            pos=pos+1;
            num=num/10;
        }
        System.out.println(result);
    }
}
