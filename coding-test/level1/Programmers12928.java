package level1;

/**
 *
 * 약수의 합
 *
 */

public class Programmers12928 {
    public static void main(String[] args) {
        Programmers12928 programmers12928 = new Programmers12928();
        System.out.println(programmers12928.solution(36));
    }
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; n/i >= i ; i++) {
            if(n%i == 0) answer += (i*i)==n ? i : i + (n/i);
        }

        return answer;
    }
}
