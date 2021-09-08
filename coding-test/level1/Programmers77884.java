package level1;

/**
 *
 * 약수의 개수와 덧셈
 *
 */
public class Programmers77884 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            int cnt = 0;
            for(int j = 1; i/j >= j; j++) {
                if(i%j==0) cnt += (j*j) == i ? 1 : 2;
            }
            answer += (cnt%2==0) ? i : -i;
        }

        return answer;
    }
}
