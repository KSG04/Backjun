import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class test {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        String arr = new String();
        String[] arr2 = new String[2];
        int ans = 0;
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            while (st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
        }



    }
}
