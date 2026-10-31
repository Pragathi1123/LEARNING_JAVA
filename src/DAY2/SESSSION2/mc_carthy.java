package DAY2.SESSSION2;

public class mc_carthy {
    public static int mcCarthy(int n){
        if(n>100){
            return n-10;
        }
        return mcCarthy(mcCarthy(n+11));
    }
public static void main(String[] args) {
    System.out.println(mcCarthy);
}
 }

