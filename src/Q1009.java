import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1009 {
    public static void main(String[] args) throws IOException {
     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

     int answer = Integer.parseInt(bf.readLine());

     for (int i=0; i < answer; i ++){
         String[] temp = bf.readLine().split(" ");

         int a = Integer.parseInt(temp[0]);
         int b = Integer.parseInt(temp[1]);

         int result = 1;

         for (int j = 0; j < b; j++){
             result = result * a % 10;
         }

         //0일 경우 10으로 처리

         result = result == 0 ? 10 : result;

         System.out.println(result);

     }


    }
}
