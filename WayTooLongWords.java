import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            String s = sc.next();

            int len = s.length();

            if (len > 10) {
                System.out.print(s.charAt(0)+""+ (len - 2) +""+ s.charAt(s.length() - 1) );
                // System.out.print(len - 2);
                // System.out.print(s.charAt(s.length() - 1));
                System.out.println();
            } else {
                System.out.println(s);
            }
        }
    }
}
