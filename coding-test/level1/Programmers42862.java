package level1;

import java.util.ArrayList;

/**
 *
 * 체육복
 *
 */
public class Programmers42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        for(int i = 0; i < lost.length; i++) {
            boolean check = true;
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    count++;
                    check = false;
                    break;
                }
            }
            if(check) list.add(lost[i]);
        }

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(reserve[j] != -1 && reserve[j] == list.get(i)-1 || reserve[j] == list.get(i)+1) {
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }

        return n - lost.length + count;
    }
}
