public class SumOfDigits {
    public static int CheckSumOfDigits(int n) {
        int sum =0;
        while( n!=0){
            int ld = n%10;
            sum+= ld;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Sum of digits of numbers is:"+" "+CheckSumOfDigits(n));
    }
    
}
