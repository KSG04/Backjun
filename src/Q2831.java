import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2831 { // 댄스파티
    static int pairs = 0;
    static int n = 0;
    static ArrayList<Integer>[] men = new ArrayList[2];
    static ArrayList<Integer>[] women = new ArrayList[2];

    public static void main(String[] args) throws IOException, NumberFormatException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        String[] menArr = br.readLine().split(" ");
        String[] womenArr = br.readLine().split(" ");


        for (int i = 0; i < 2; i++) {

            men[i] = new ArrayList<Integer>();
            women[i] = new ArrayList<Integer>();

        }

        for (int i = 0; i < n; i++) {

            int menheight = Integer.parseInt(menArr[i]);
            int womenheight = Integer.parseInt(womenArr[i]);

            if (menheight < 0)
                men[0].add(menheight * -1);
            else
                men[1].add(menheight);

            if (womenheight < 0)
                women[1].add(womenheight * -1);
            else
                women[0].add(womenheight);

        }

        for (int i = 0; i < 2; i++) {

            Collections.sort(men[i]);
            Collections.sort(women[i]);
        }
        Q2831 q2831 = new Q2831();

        q2831.findPair(0);
        q2831.findPair(1);

        System.out.println(pairs);

        br.close();

    }


    public void findPair(int type) {

        for (int i = 0, j = 0; i < men[type].size() && j < women[type].size(); ) {
            // 0번 타입 : 남자가 크고 여자가 작은 커플
            // 1번 타입 : 남자가 작고 여자가 큰 커플
            int manNeedSmall = type == 0 ? men[type].get(i) : women[type].get(i);
            int womenNeedTall = type == 0 ? women[type].get(i) : men[type].get(i);

            if (manNeedSmall <= womenNeedTall){
                if (type == 0)
                    i++;
                else
                    j++;
                continue;
            }
            pairs++;
            i++;
            j++;

        }

    }
}
