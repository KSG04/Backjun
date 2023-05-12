import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

public class Q1075 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num =Integer.parseInt(bf.readLine());
        int num2 = Integer.parseInt(bf.readLine());

        num = (num/100) * 100;
        String result = "";
        for (int i = 0;;num++){
            if (num % num2 == 0){
                result = String.valueOf(num);
                break;
            }
        }
        result = result.substring(result.length()-2);
        System.out.println(result);



    }



}
