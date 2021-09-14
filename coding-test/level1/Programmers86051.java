package level1;

import java.util.Arrays;

/**
 *
 * 없는 숫자 더하기
 *
 */
public class Programmers86051 {
    public static void main(String[] args) {
        Programmers86051 programmers86051 = new Programmers86051();
        programmers86051.solutionStream(new int[]{1,2,3,4,6,7,8,0});
    }
    public int solutionStream(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

    public int solution(int[] numbers) {
        int answer = 45;

        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }
}
