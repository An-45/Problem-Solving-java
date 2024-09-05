import java.lang.Math;

public class RootsOfQuadraticEquations {
    public static void CheckRoots(int a,int b,int c) {
        if(a==0) {
            System.out.println("Invalid");
        }

        int d =(b*b)-(4*a*c);
        double sqr_val = Math.sqrt(Math.abs(d));

        if(d>0) {
            double r1 =(double) (-b+sqr_val)/(2*a);
            double r2 =(double) (-b-sqr_val)/(2*a);
            System.out.println("The Roots of equation are:"+r1+"\n"+r2);
        }

        else if(d==0) {
            double r1 =(double) b/(2*a);
            double r2 = (double) b/(2*a);
            System.out.println("The Roots of equation are:"+r1+"\n"+r2);
        }
        else {
            System.out.println("The Roots of equation are Complex!");
            System.out.println(-(double)(b / (2 * a))+"+i"+(sqr_val/2*a)+"\n"+
           -(double)(b / (2 * a))+"-i"+(sqr_val/2*a) );
        }
    }

    public static void main(String[] args) {
        int a= 1, b=1,c=1;
        
        CheckRoots(a,b,c);
    }
    
}
