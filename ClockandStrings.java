import java.util.Scanner;

public class ClockandStrings {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=1 ; i <= t ; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if((a == c || a == d || b == c || b == d) || (Math.min(a, b) < Math.min(c, d) && Math.max(a, b) > Math.min(c, d)) || (Math.min(a, b) > Math.min(c, d) && Math.min(a, b) < Math.max(c, d)))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
