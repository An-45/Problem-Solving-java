public class Main{
    static boolean checkPrime(int n) {
        int count =0;
        for(int i=1;i<=n; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count==2) {
            return true;
        }
        else {
            return false;
        }
    }

    // public static void main(String args[]) {
    //     int n =10;
    //     if(checkPrime(n))  {
    //         System.out.println(n + "  is a prime number");
    //     }
    //     else {
    //         System.out.println(n + "is not a prime number");
    //     }

     public static void main(String args[]) {
         int a=50,b=80;
         for(int i=a;i <=b; i++) {
        
         if(checkPrime(i))  {
        System.out.println(i + "  is a prime number");
         }
   
        }

     }

    }
