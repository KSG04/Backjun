import java.lang.reflect.Array;
import java.util.*;

public class Q2750 {
    //N개의 수가 주어졌을 떄, 이를 오름차순으로 정렬하는 프로그램 작성

    boolean checkNumber(List<Integer> list, int number){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == number){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q2750 q2750 = new Q2750();

        int lineNumber = (int)(Math.random() * 10) + 1 ;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number = 0;

        System.out.println(lineNumber);

        for (int i = 1; i <= lineNumber; i++){
           while (true){

               number = (int)(Math.random()*10)+1;

               if (q2750.checkNumber(list,number)){
                   list.add(number);
                   break;
               }
           }
        }

        for (int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }

        System.out.println("=============================");

        System.out.println("오름 차순 정렬 1번 or 내림차순 정렬 2번");

        Scanner in = new Scanner(System.in);

        int lineChange = in.nextInt();

        switch (lineChange){
            case 1 :
                list.sort(Comparator.naturalOrder());
                System.out.println(list);
                break;
            case 2 :
                list.sort(Comparator.reverseOrder());
                System.out.println(list);
                break;
        }

    }
}
