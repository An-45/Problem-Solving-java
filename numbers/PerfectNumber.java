public class PerfectNumber {
    public static boolean checkPerfect(int n) {
        int sum =0;


        for(int i=1;i < n;i++) {
            if(n % i == 0){
                sum= sum+i;
            }
        }
        if(sum == n) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        if(checkPerfect(n)) {
            System.out.println(n+" "+"is a perfect number");
        }
        else {
            System.out.println(n+" "+"is not a perfect number");
        }
    }
    
}
