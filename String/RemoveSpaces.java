public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Dont trust RCCIIT";
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
}
