//Que-Write a java program that prints all the prime numbers in a given range.

import java.util.Scanner;
public class Practice_prime_num_in_range {
    static boolean isPrime(int n){
      for(int j=2;j*j<=n;j++){
          if(n%j==0){
              return false;
          }
      }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start value");
        int start=sc.nextInt();
        System.out.println("Enter the end value");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }
    }
}
