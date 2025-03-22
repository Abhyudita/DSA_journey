//Que-Write a code that counts the frequency of every digit in the number.

public class Practice_count_frequency {
    public static void main(String[] args) {
        //when we have to keep a track of two values, i.e., digits and frequencies => we use a map.
        //Map has keys and vales. Keys are always unique.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        HashMap<Integer,Integer> m=new HashMap<>();
        while(num>0){
            int rem=num%10;
            if(m.get(rem)==null){//get(key
                m.put(rem,1);//put(key,value)
            }
            else{
                int count=m.get(rem);//gives the count
                count++;
                m.put(rem,count);
            }
            num=num/10;
        }
        System.out.println(m);
    }
}
