package DAY3.SESSION2;
public class leetcode14 {
    

    public static String longestCommonPrefix(String[] str) {
     String check=str[0];
     for(int i=1;i<str.length;i++){
     while(!str[i].startsWith(check)){
        check=check.substring(0,check.length()-1);
        if(check.isEmpty()){
            return"";

        }
     }

    }
    return check;
}
public static void main(String[] args){
    String[] str={"dog","dool", "does"};
    System.out.println(longestCommonPrefix(str));
}
}