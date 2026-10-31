package DAY3.SESSION1;
public class InternFunction {
    public static void main(String[] args) {
        String S1="Manoj";
        String S2=new String("manoj");
        System.out.println(S1.equals(S2));
        String S3=S2.intern();
        System.out.println(S1==S3);
    }
}
