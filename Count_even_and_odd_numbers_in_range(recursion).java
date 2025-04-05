//Que-Write a java program that counts the number of even and ood numbers in a given range.
import java.util.Scanner;
public class Practice_recursion_count_even_odd_number_in_range_array {
    static int[] count(int start,int end){//we want to return 2 values that is why using an array
        if(start>end){
            int result[]=new int[2];
            return result;
        }
        int result[]=count(start+1,end);
        if(start%2==0){
            result[0]+=1;
        }
        else{
            result[1]+=1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting");
        int start=sc.nextInt();
        System.out.println("Enter the ending");
        int end=sc.nextInt();
        int arr[]=count(start,end);
        System.out.println("Even: "+arr[0]);
        System.out.println("Odd: "+arr[1]);
    }
}
