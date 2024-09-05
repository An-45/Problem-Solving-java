// public class pattern {
//     public static void main(String args[]){
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//     }
// }

// public class pattern {
//     public static void main(String args[]){
//        int a = 30;
//        int b= 20;
//        int sum = a+b;
//        System.out.println(sum);
//     }

// public class pattern {
//     public static void main(String args[]) {
//         for(int counter=0; counter <100; counter++) {
//             System.out.println("Hello World");
//         }
//     }
// }


public class pattern {
    public static void main(String args[]) {
        // int i = 0;
        // // while( i< 11) {
        // //     System.out.println(i);
        // //     i++;
        // // }

        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i<21);

        // int n= 4;
        // int m= 5;

        // for( int i=1; i<=n; i++){
        //     for(int j =1; j<=m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n= 4;
        // int m= 5;

        //  for (int i =1; i<=n; i++) {
        //      for(int j= 1; j<=m; j++) {
        //          if(i==1 || j==1 || i==n || j==m) {
        //             System.out.print("*");
        //          }
        //          else {
        //              System.out.print(" ");
        //          }
        //      }
        //      System.out.println();
        //  }

        // for(int i = 1; i<= n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = n; i >=1; i--) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i= 1; i<=n; i++) {
        //     for(int j=1; j<= n-i; j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j=1 ; j<=i ; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        int n=5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i==0||i== n-1||j==0||j==n-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        }
    }




