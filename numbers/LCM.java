import java.util.Scanner;

public class LCM {
    public static int CheckGCD(int n1, int n2){
        int GCD= 1;
        for(int i =1; i <= Math.min(n1,n2); i++) {
            if(n1%i ==0 && n2%i ==0){
                GCD = i;

            }
            
        }
        return GCD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc .nextInt();
        int n2 =  sc.nextInt();
        
        int LCM= (n1*n2)/CheckGCD(n1,n2);
        

        System.out.println("LCM OF two numbers is :"+" "+LCM);
    }
    
}


