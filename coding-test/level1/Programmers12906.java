package level1;

import java.util.ArrayList;

/**
 *
 * 같은 숫자는 싫어
 *
 */
public class Programmers12906 {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        int temp = arr[0];

        for(int i= 0; i < arr.length; i++) {
            if(arr[i]!=temp) {
                list.add(arr[i]);
                temp = arr[i];
            }
        }

        return list;
    }
}
