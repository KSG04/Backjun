import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10430 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String ans1 = bf.readLine();

        String[] arr = ans1.split(" ");

        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);

        System.out.println( (A + B) % C);
        System.out.println( ((A % C) + (B % C)) % C);
        System.out.println( (A * B) % C);
        System.out.println( ((A % C) * (B % C)) % C);
    }
}
