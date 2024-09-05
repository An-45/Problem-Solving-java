import java.util.Scanner;

public class ASCII {
    public static void CheckAscii(char c) {
        int ascii = c;
        System.out.println(ascii);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charecter to check:");
        char letter =sc.next().charAt(0);
        CheckAscii(letter);
    }
    
}
