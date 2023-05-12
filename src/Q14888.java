import java.util.ArrayList;
import java.util.Scanner;

public class Q14888 {

    public static void main(String[] args) {
        System.out.print("수의 개수 입력 : ( 2 <= N <= 11 )");
        Scanner in = new Scanner(System.in);
        int fNumber = in.nextInt();
        int sNumber = 0;
        String list = "";
        System.out.println("수의 개수만큼 정수 입력 ( 1 <= N N= 100 ) ");
        list = in.next();
        System.out.println(list);
        String[] list2 = list.split(" ");
        for (int i = 0; i < fNumber; i++){
            System.out.println(list2[i]);
        }

        System.out.println("사용할 연산자 " + (fNumber-1) + "개 선택");
        ArrayList<String> list3 = new ArrayList<String >();
        System.out.println("+ - *  %");

    }
}
