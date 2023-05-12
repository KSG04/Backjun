import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2577  {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> arr = new ArrayList<>();
        int ans = 0;
        String total ;
        int[] arr2 = new int[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++){
            ans = Integer.parseInt(bf.readLine());
            if (ans >= 100 && ans < 1000 ){
                arr.add(ans);
            }else {
                System.out.println("잘못 입력");
            }
            ans *= arr.get(i);
        }
        total = String.valueOf(ans);

        for (int i = 0; i < total.length(); i++){
            arr2[(total.charAt(i)-48)]++;
        }
        for(int v : arr2){
            System.out.println(v);
        }

    }



}
