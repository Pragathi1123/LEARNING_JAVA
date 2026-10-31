import java.util.Scanner;

class Method1 {
    static String range(int low, int high) {
        String result = " ";

        for (int i = low; i <= high; i += 2) {
            result = result + i + " ";
        }

        return result;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        System.out.println(range(low, high));
    }
}