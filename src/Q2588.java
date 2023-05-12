import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//브론즈 3단계
public class Q2588 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ans1;
        String ans2;
        ArrayList<Integer> result = new ArrayList<Integer>();
        ans1 = bf.readLine();
        ans2 = bf.readLine();


        for (int i = ans2.length()-1;i >= 0; i--){
            int a = Integer.parseInt(String.valueOf(ans2.charAt(i)));
            for (int j = ans1.length()-1; j >= 0; j--){
                int b = Integer.parseInt(String.valueOf(ans1.charAt(j)));
                result.add(a*b);
            }
        }

    }



}
