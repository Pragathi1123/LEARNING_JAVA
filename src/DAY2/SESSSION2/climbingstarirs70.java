package DAY2.SESSSION2;

public class climbingstarirs70 {
static int climb(int n) {
if(n==1||n==0){
    return 1;
}
}
return climb(n-1)+ climb(n-2);


}
public static void main(String[] args)
{
    int N=4;
    System.out.println("climb(N)");
}
