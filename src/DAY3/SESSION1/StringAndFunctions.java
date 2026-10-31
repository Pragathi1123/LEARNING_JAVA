package DAY3.SESSION1;
import java.util.Scanner;
public class StringAndFunctions {
    public static void main(String[] args){
        String name1="Vidhya";
        String name2="vidhya";
        System.out.println(name1.equalsIgnoreCase(name2));
        String result=name1.concat(name2);
        System.out.println(result);
         System.out.println(name1.contains("v"));
          System.out.println(name1.StartWith("V"));
           System.out.println(name1.indexOff("v"));


    }
}
