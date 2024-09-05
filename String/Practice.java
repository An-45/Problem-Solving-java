// public class RemoveVowels {
//     public static String removeVowels(String str) {
//         return str.replaceAll("[aeiouAEIOU]","");
//     }

//     public static void main(String[] args) {
//         String s ="Apple";
//         s=s.toLowerCase();
//         System.out.println("After removing the vowel the string is:"+ " "+removeVowels(s));
//     }
    
// }

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string to remove the vowels:");
        String s =sc.nextLine();
        s= s.toLowerCase();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i)== 'e' || s.charAt(i)=='i'|| s.charAt(i) == 'o'
            || s.charAt(i) == 'u') {

            }

            else {
                System.out.println(s.charAt(i));
            }

        }
    }
}

    

   
