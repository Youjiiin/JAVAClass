package Week2;

//피보나치 수열
public class Q4_11 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;

        System.out.println(arr[0] + "," + arr[1]);

        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 2] + arr [i - 1];
            System.out.println(arr[i]);
        }
        System.out.println(arr[9]);
    }
}
