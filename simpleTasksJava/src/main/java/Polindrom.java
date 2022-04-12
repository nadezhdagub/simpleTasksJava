import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        String inps, revs = "";
        Scanner scanner = new Scanner(System.in);
        inps = scanner.nextLine();
        for (int i = inps.length() - 1; i >= 0; i++) {
            revs = revs + inps.charAt(i);
        }
        System.out.println(revs);

        if (inps.equals(revs)) {
            System.out.println("OK");
        } else {
            System.out.println("NOT");
        }
    }
}
