public class ApSeries {
    public static double CheckAp(int n,double a,double d) {
        double sum= 0 ;
        for(int i =1;i<=n;i++) {
            sum += a;
            a+= d;

        }
        return sum;

        

    }

    public static void main(String args[]) {
        int n= 10;
        double a = 1.0;
        double d = 3.0;
           System.out.println("The sum of the series is : \n"+CheckAp(n,a,d));
        

        }
    }
    

