import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String str = sc.next();

            switch (str) {
                case "x++":
                    x++;
                    break;

                case "++x":
                    ++x;
                    break;

                case "x--":
                    x--;
                    break;

                case "--x":
                    --x;
                    break;
            }
        }

        System.out.println(x);
    }

}


//other way to solve

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = Integer.parseInt(scanner.nextLine()); //total count of statements
//         int res = 0;

//         for (int i = 0; i < n; i++) 
//         {
//             String tmp = scanner.nextLine();
//             if(tmp.contains("++")){
//                 res+=1;
//             }
//             else{
//                 res-=1;
//             }
//         }

//         System.out.println(res);
//     }
// }
