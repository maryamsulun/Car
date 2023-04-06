import java.util.Random;
    public class MinandMax {
        public static void main(String[] args) {
            int arr[] = new int[10];
            Random r = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Math.round((r.nextInt(100) + 1));
            }
            for (int x : arr) {

            }
        }
    }