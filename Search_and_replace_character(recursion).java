//Que-Write a java program that searches a character and replaces a it with your desired character in a string using recursion.

import java.util.Scanner;
public class Practice_recursion_search_and_replace_char {
    static String search_replace(String str,char search,char replace){
        if(str.length()==0){
            return "";
        }
        String result=search_replace(str.substring(1),search,replace);
        if(str.charAt(0)==search){
            return replace+result;//if we write str.replace(search,replace),it creates a new string
        }
        return str.charAt(0)+result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter the character you want to search");
        char s=sc.next().charAt(0);
        System.out.println("Enter the character you want to replace it with");
        char r=sc.next().charAt(0);
        System.out.println(search_replace(str,s,r));
    }
}
