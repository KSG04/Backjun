import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ans = br.readLine();
        int[] counting = new int[10];

        for (int i = 0 ; i < ans.length(); i++){
            counting[ans.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--){
            while (counting[i]-- > 0){
                System.out.print(i);
            }
        }

    }

}
