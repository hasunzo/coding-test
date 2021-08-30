package level1;

import java.util.Arrays;

/**
 *
 * 예산
 *
 */
public class Programmers12982 {
    public static void main(String[] args) {
        Programmers12982 programmers12982 = new Programmers12982();
        System.out.println(programmers12982.solution(new int[] {1,3,2,5,4}, 9));
    }
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget < 0) {
                return answer;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
