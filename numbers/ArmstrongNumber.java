import java.lang.Math;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length();
        int sum= 0;
        int n= num;

        while(n>0) {
            int ld= n% 10;
            sum+= Math.pow(ld,k);
            n= n/10;
        }
        if(sum==num){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String args[]) {
        int n =153;
        if (isArmstrong(n)){
            System.out.println(n+" "+"is an armstrong number");
        }
    }
    
}
