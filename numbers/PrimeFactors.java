



public class PrimeFactors {
    public static boolean CheckPrimeFactors(int n){
        int count =0;
        for(int i=1; i<= n;i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 30;
        for(int i= 1;i<= num; i++){
            if(num%i ==0 && CheckPrimeFactors(i)) {
                System.out.println(i +" "+"is prime numbers");
            }
        }

    }
        

        
    

    
}
