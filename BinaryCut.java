import java.util.Scanner;

public class  BinaryCut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        while (t-- > 0) {
            String s = scanner.nextLine();
            int result = minPiecesToSort(s);
            System.out.println(result);
        }
    }

    public static int minPiecesToSort(String s) {
        int countOnes = 0;
        int countZeros = 0;

        // Count the number of ones and zeros
        for (char c : s.toCharArray()) {
            if (c == '0') {
                countZeros++;
            } else {
                countOnes++;
            }
        }

        // Return the maximum of count of ones and count of zeros
        return Math.max(countOnes, countZeros);
    }
}
