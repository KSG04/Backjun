import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q1076 {
    public static void main(String[] args) throws IOException {
        Map<String,String> map = new HashMap<>();
        map.put("black","0");
        map.put("brown","1");
        map.put("red","2");
        map.put("orange","3");
        map.put("yellow","4");
        map.put("green","5");
        map.put("blue","6");
        map.put("violet","7");
        map.put("grey","8");
        map.put("white","9");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ans1 = bf.readLine();
        String ans2 = bf.readLine();
        String ans3 = bf.readLine();

        long result = Long.parseLong(map.get(ans1) + map.get(ans2));
        result *= Math.pow(10.0,(double)Integer.parseInt(map.get(ans3)));

        System.out.println(result);


    }
}
