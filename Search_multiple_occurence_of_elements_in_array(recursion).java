//Que-Write a java program that returns an array which has all the indexes of the element that you want to search in an array.

import java.util.Scanner;

public class Practice_recursion_occurance_of_element_in_array_arrayreturn {
    static int[] occurance(int[] arr,int index,int element,int count){
        if(index== arr.length){
            int[] result=new int[count];
            return result ;
        }
        if(arr[index]==element){
            count++;
        }
        if(arr[index]==element){
            int result[]=occurance(arr,index+1,element,count);
            result[count-1]=index;
            return result;
        }
        return occurance(arr,index+1,element,count);
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
        System.out.println("Enter the element to search");
        int e=sc.nextInt();
        int[] result=occurance(arr,0,e,0);
        System.out.println(result);
        for(int i=0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
