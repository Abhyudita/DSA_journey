//Que-Write a java program that tells whether an array is sorted or not.

import java.util.Scanner;
public class Practice_recursion_array_sorted_or_not {
    static boolean is_Sorted(int[] arr,int index){//3
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return is_Sorted(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(is_Sorted(arr,0));
    }
}
