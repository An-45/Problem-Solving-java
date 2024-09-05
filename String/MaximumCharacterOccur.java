public class MaximumCharacterOccur {
    public static char maxOccuringChar(String str) {
        char ans='a';
        char arr[]=str.toCharArray();
        int maxfreq=0,n=str.length(),count=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(count>maxfreq) {
                maxfreq=count;
                ans=str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="My Name is Ankan Das";
        System.out.println("The maximum occuring character is:"+maxOccuringChar(str));
    }
    
    
}
