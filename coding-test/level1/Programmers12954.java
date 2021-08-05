package level1;

/**
 *
 * x만큼 간격이 있는 n개의 숫자
 *
 */
public class Programmers12954 {
    public static void main(String[] args) {
        Programmers12954 programmers12954 = new Programmers12954();
        for(long num : programmers12954.solution(-4, 2)){
            System.out.println(num);
        }
    }
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (i+1)*(long)x;
        }
        return answer;
    }
}
