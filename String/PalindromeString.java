public class PalindromeString {
    public static boolean CheckPalindromeString(String s){
        String rev="";
        boolean ans= false;
        for(int i = s.length()-1;i>=0;i--){
            rev = rev+ s.charAt(i);
        }

        if(s.equals(rev)){
            return ans =true;
        }
        return ans;

    }

    public static void main(String[] args) {
        String str = "ABCBC";
        str=str.toLowerCase();
        boolean answer = CheckPalindromeString(str);
        
            System.out.println(answer);
        
        
    }
}