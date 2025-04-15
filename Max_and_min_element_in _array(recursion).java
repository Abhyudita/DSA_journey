//Que-Write a java program that returns an array which contains the maximum and the minimum element in an array.

import java.util.Scanner;

public class Practice_recursion_min_and_max_element_in_array {
    static int[] min_max(int[] arr,int index){
        if(index==arr.length){
            int[] r=new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
            return r;
        }
        int[] result=min_max(arr,index+1);
        if(arr[index] < result[0]){
            result[0]=arr[index];
        }
        if(arr[index] > result[1]){
            result[1]=arr[index];
        }
        return result;
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
        int[] result=min_max(arr,0);
        System.out.print("Min: "+result[0]+" Max: "+result[1]);
    }
}
