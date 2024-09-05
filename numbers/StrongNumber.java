import java.util.Scanner;

public class StrongNumber {
    public static int Factorial(int n) {
        int fact =1;
        for(int i=1; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static int StrongNum(int num) {
        int sum = 0;
        while(num > 0) {
            int ld =num % 10;
            sum += Factorial(ld);
            num = num /10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==StrongNum(number) && number != 0) {
            System.out.println(number+" "+"is a Strong num");

        }
        else {
            System.out.println(number+" "+"is not a Strong num");
        }
    }



    
    }
    

