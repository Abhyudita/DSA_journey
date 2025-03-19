//Que-Find the sum of all the digits in a number.
public class Sum_of_digit {
    static int sumofdigits(int num){
        int sum=0;
        while(num>0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(110010));
    }
}
