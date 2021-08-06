package level1;

import java.util.ArrayList;

/**
 *
 * 제일 작은 수 제거하기
 *
 */
public class Programmers12935 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int index = 0;

        for(int i=0; i < arr.length; i++) {
            if(arr[i]<arr[index]) {
                index = i;
            }
        }

        for(int i=0; i < arr.length; i++) {
            if(i != index) answer.add(arr[i]);
        }

        if(answer.size() == 0) {
            answer.add(-1);
        }

        return answer;
    }
}
