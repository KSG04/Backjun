import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1085 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] ans = bf.readLine().split(" ");

        int x1 = Integer.parseInt(ans[0]) - 0;
        int x2 = Integer.parseInt(ans[2]) - Integer.parseInt(ans[0]);

        int y1 = Integer.parseInt(ans[1]) - 0;
        int y2 = Integer.parseInt(ans[3]) - Integer.parseInt(ans[1]);

        int min =  x1 > x2 ? x2 : x1 ;
        int min2 = y1 > y2 ? y2 : y1 ;

        int total = min > min2 ? min2 : min;

        System.out.println(total);





    }


}
