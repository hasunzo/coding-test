package level1;

import java.util.Arrays;

/**
 *
 * 최솟값 만들기
 *
 */
public class Programmers12941 {
    public static void main(String[] args) {
        Programmers12941 programmers12941 = new Programmers12941();
        System.out.println(programmers12941.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
    }
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length-i-1];
        }

        return answer;
    }
}
