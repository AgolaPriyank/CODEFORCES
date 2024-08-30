import java.util.*;

public class XOUR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] result = findLexicographicallySmallest(arr);
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }

    public static int[] findLexicographicallySmallest(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        return arr;
    }
}
