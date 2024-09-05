public class LeapYear {
    public static boolean CheckLeap(int n) {
        int year = n;
        if((year%400==0) || (year%100 != 0) && (year%4==0)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2000;
        if(CheckLeap(year)){
            System.out.println(year+" "+ "is a Leap yr");
        }
        else{
            System.out.println(year+" "+"is not a Leap yr");
        }
    }
    
}
