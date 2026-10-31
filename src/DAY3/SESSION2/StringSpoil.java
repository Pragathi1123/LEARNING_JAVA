
package DAY3.SESSION2;

import java.util.Scanner;

public class StringSpoil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String s = sc.nextLine();

        int mid = s.length() / 2;

        String first = s.substring(0, mid);
        String second = s.substring(mid);

        String rev1 = new StringBuilder(first).reverse().toString();
        String rev2 = new StringBuilder(second).reverse().toString();

        String result = rev1 + rev2;

        System.out.println("New String: " + result);
    }
}