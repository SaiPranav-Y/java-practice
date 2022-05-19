import java.util.Scanner;

public class Basicprogram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Here, we need to add this line to clear buffer so that string can be read.
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        System.out.println("------------------");
        String s1 = scan.nextLine();
        int x = scan.nextInt();
        System.out.printf("%-15s%03d%n", s1, x);// Here, we can use printf function to format the spacing and padding in a line,

        scan.close();
    }
}