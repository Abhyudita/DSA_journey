//Que-Write a java program that prints a hollow square for n number of rows.

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1 || i==5){
                for(int j=1;j<=n;j++){//1<5
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=1;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=4;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
