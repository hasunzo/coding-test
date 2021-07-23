package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 나누어 떨어지는 숫자 배열
 *
 */

public class Programmers12910 {
    public static void main(String[] args) {
        Programmers12910 programmers12910 = new Programmers12910();

        int[] arr = programmers12910.solution(new int[] {2, 36, 1, 3}, 1);

        for(int num : arr) {
            System.out.println(num);
        }

    }
        public int[] solution(int[] arr, int divisor) {
            List<Integer> temp = new ArrayList<>();

            for(int num : arr){
                if(num%divisor == 0) {
                    temp.add(num);
                }
            }

            if(temp.size() == 0) {
                int[] answer = new int [] {-1};
                return answer;
            } else {
                int[] answer = new int[temp.size()];
                for(int i = 0; i < temp.size(); i++){
                    answer[i] = temp.get(i);
                }

                Arrays.sort(answer);
                return answer;
            }
        }

}
