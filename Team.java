import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int problems = sc.nextInt();

        int A[][] = new int[problems][3];

        int solveingProblem = 0;

        for (int i = 0; i < problems; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();

                sum = sum + A[i][j];
            }
            System.out.println();

            if (sum == 2 || sum == 3) {
                solveingProblem++;
            }

        }

        System.out.println(solveingProblem);
    }
}