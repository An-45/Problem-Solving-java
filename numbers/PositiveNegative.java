import java.util.Scanner;

public class PositiveNegative {
    public static boolean checkPositiveNegative(int n) {
        if( n> 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n==0){
            System.out.println("number is 0");
        }

        else if(checkPositiveNegative(n)){
            System.out.println(n+" "+"is positive number");
        }
        else{
            System.out.println(n+" "+"is negative number");
        }
    }
}
