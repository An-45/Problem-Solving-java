
import java.util.Arrays;

public class AnagramString {
    public static String sortString(String s) {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

public static boolean checkAnagramString(String str1,String str2) {
    if(str1.length()!=str2.length()) {
        return false;

    }
    str1=sortString(str1);
    str2=sortString(str2);
    for(int i=0;i<str1.length();i++) {
        if(str1.charAt(i)!=str2.charAt(i)){
            return false;
        }

    }
    return true;
}

public static void main(String[] args) {
    String str1="CAT";
    String str2="ACT";
    boolean isAnagram=checkAnagramString(str1, str2);
    if(isAnagram){
        System.out.println("The strings are in Anagram");
    }else{
        System.out.println("The strings are not in Anagram");
    }
}
}
