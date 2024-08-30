import java.util.Scanner;

public class CirclePerimeter {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 1 ; i <= t ; i++)
        {
            int r = sc.nextInt();

            r = r * 8;

            System.out.println(r);
        }
    }
}
