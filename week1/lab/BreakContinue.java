public class BreakContinue {
    public static void windowPoseSum(int[] a, int n) {
        for (int i = 0; i < a.length; i += 1) {
            if (a[i] > 0) {
                for (int j = 1; j <= n; j += 1) {
                    if (i + j == a.length) {
                        break;
                    }
                    a[i] += a[i + j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPoseSum(a, n);

        System.out.println(java.util.Arrays.toString(a));
    }
}
