import java.util.Arrays;
import java.util.Scanner;

public class Q2587 { // 대표값2 브론즈2

    public static void main(String[] args) {

        int[] arr = new int[5];
        int sum = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        System.out.println(sum/arr.length);
        System.out.println(arr[2]);

        in.close();


    }


}
