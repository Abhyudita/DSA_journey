//Que-Write a java program that tells whether a given element is present in the array or not.

import java.util.Scanner;
public class Practice_recursion_search_an_element_in_array_boolean {
    static boolean search(int arr[],int element,int index){
        if(index== arr.length){
            return false;
        }
        if(arr[index]==element){
            return true;
        }
        return search(arr,element,index+1);
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
        if(search(arr,e,0)==true){
            System.out.println("present");
        }
        else{
            System.out.println("Not present");
        }
    }
}
