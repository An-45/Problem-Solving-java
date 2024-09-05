public class GpSeries {
    public static double CheckGp(int n,double a,double r){
        double sum=0.0;
        for(int i =1;i<=n;i++) {
            sum+=a;
            a=a*r;
        }
        return sum;

    }

    public static void main(String[] args) {
        double a= 12.5;
        double r =10.0;
        int n =5;
        System.out.println("The sum of Gp series is: \n"+CheckGp(n,a,r));
    }
    
}
