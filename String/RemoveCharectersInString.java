public class RemoveCharectersInString {
    public static String RemoveCharecters(String str,int length) {
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<length;i++) {
            int ascii =(int)str.charAt(i);
            if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s ="Ankan@2001";
        int l= s.length();
        System.out.println(RemoveCharecters(s,l));
    }
    
}
